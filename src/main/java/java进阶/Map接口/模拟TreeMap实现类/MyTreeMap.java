package java进阶.Map接口.模拟TreeMap实现类;
import java.util.*;
/*
TreeMap底层基于红黑树实现，红黑树是一种自平衡的二叉查找树，可以保证查找、插入、删除等操作在最坏情况下的时间复杂度都为 O(log n)。
当插入一个元素时，按照键的大小顺序插入到红黑树中，通过比较键的大小来进行查找和遍历。

TreeMap的put、get、remove方法的时间复杂度为 O(log n)，比HashMap低效，但由于其能够保证数据按照键的大小有序的特性，
在需要排序的情况下可以发挥更高的效率。
 */
public class MyTreeMap<K extends Comparable<K>, V> {
    private Node root;  // 根节点
    private int size;   // 大小

    private class Node {
        K key;          // 键
        V value;        // 值
        Node left;      // 左子节点
        Node right;     // 右子节点
        int size;       // 子树大小

        public Node(K key, V value) {   // 构造函数
            this.key = key;
            this.value = value;
            this.size = 1;
        }
    }

    // 返回大小
    public int size() {
        return size;
    }

    // 判断是否为空
    public boolean isEmpty() {
        return size() == 0;
    }

    // 判断是否包含键
    public boolean containsKey(K key) {
        return get(key) != null;
    }

    // 获取指定键的值
    public V get(K key) {
        Node node = root;
        while (node != null) {
            int cmp = key.compareTo(node.key);
            if (cmp < 0) {
                node = node.left;
            } else if (cmp > 0) {
                node = node.right;
            } else {
                return node.value;
            }
        }
        return null;
    }

    // 插入键值对
    public void put(K key, V value) {
        if (key == null) {
            throw new NullPointerException("The key cannot be null");  // 抛出空指针异常
        }
        if (root == null) {
            root = new Node(key, value);
        } else {
            root = put(root, key, value);   // 递归插入
        }
        size++;
    }

    // 递归插入
    private Node put(Node node, K key, V value) {
        if (node == null) {
            return new Node(key, value);   // 如果节点为空，直接插入
        }
        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            node.left = put(node.left, key, value);   // 在左子树中插入
        } else if (cmp > 0) {
            node.right = put(node.right, key, value); // 在右子树中插入
        } else {
            node.value = value;   // 如果键已存在，更新值
        }
        node.size = 1 + size(node.left) + size(node.right);   // 更新子树大小
        return node;
    }

    // 移除键值对
    public void remove(K key) {
        if (!containsKey(key)) {
            return;
        }
        root = remove(root, key);   // 递归移除
        size--;
    }

    // 递归移除
    private Node remove(Node node, K key) {
        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            node.left = remove(node.left, key);   // 在左子树中移除
        } else if (cmp > 0) {
            node.right = remove(node.right, key); // 在右子树中移除
        } else {
            // 如果目标节点有两个子节点，则找到右子树中最小的节点，用它替代目标节点
            if (node.left == null) {
                return node.right;
            }
            if (node.right == null) {
                return node.left;
            }
            Node temp = node;
            node = min(temp.right);
            node.right = deleteMin(temp.right);
            node.left = temp.left;
        }
        node.size = 1 + size(node.left) + size(node.right);   // 更新子树大小
        return node;
    }

    // 获取节点数量
    private int size(Node node) {
        if (node == null) {
            return 0;
        }
        return node.size;
    }

    // 获取最小的节点
    private Node min(Node node) {
        if (node.left == null) {
            return node;
        }
        return min(node.left);
    }

    // 删除最小的节点
    private Node deleteMin(Node node) {
        if (node.left == null) {
            return node.right;
        }
        node.left = deleteMin(node.left);
        node.size = 1 + size(node.left) + size(node.right);   // 更新子树大小
        return node;
    }

    // 获取键集合
    public Set<K> keySet() {
        Set<K> set = new TreeSet<K>();
        keySet(root, set);   // 递归获取键集合
        return set;
    }

    // 递归获取键集合
    private void keySet(Node node, Set<K> set) {
        if (node == null) {
            return;
        }
        keySet(node.left, set);
        set.add(node.key);
        keySet(node.right, set);
    }

    // 获取值集合
    public Collection<V> values() {
        List<V> list = new ArrayList<V>();
        values(root, list);   // 递归获取值集合
        return list;
    }

    // 递归获取值集合
    private void values(Node node, List<V> list) {
        if (node == null) {
            return;
        }
        values(node.left, list);
        list.add(node.value);
        values(node.right, list);
    }
}
class test{
    public static void main(String[] args) {
        MyTreeMap<String,Integer> map = new MyTreeMap<>();
        map.put("A", 1);
        System.out.println(map.get("A"));
    }
}
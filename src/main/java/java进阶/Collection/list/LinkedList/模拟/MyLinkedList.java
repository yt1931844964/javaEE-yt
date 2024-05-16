package java进阶.Collection.list.LinkedList.模拟;

public class MyLinkedList {
    //定义一个首节点，指向第一个元素
    Node first;
    //定义一个尾节点，指向最后一个元素
    Node last;
    //定义一个计数器，代表存入元素数量
    int count = 0;

    public MyLinkedList() {

    }

    //模拟add方法
    public void add(Object o) {
        if (first == null) {
            Node n = new Node(); //将添加的元素封装为一个Node对象
            n.setPre(null);
            n.setObj(o);
            n.setNext(null);
            first = n;
            last = n; //元素首节点和尾节点都是n，因为这是第一个元素
        } else { //现在不是第一个元素了
            Node n = new Node();
            n.setPre(last); //上一个节点一定是last
            n.setObj(o);
            n.setNext(null);
            last.setNext(n); //将新节点设置为上一个节点的后继节点
            last = n; //尾节点下移
        }
        count++; //维护计数器
    }

    //模拟通过下标得到元素
    public Object get(int index) {
        if (index < 0 || index >= count) { //检查下标是否越界
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + count);
        }
        Node n = first;
        for (int i = 0; i < index; i++) {
            n = n.getNext();
        }
        return n.getObj();
    }

    //优化下标查找元素，当下标大于一半时，从后向前查找
    public Object newGet(int index) {
        if (index < 0 || index >= count) { //检查下标是否越界
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + count);
        }
        if (index < count / 2) {
            Node n = first;
            for (int i = 0; i < index; i++) {
                n = n.getNext();
            }
            return n.getObj();
        } else {
            Node n = last;
            for (int i = count - 1; i > index; i--) {
                n = n.getPre();
            }
            return n.getObj();
        }
    }

    //插入一个元素
    public void insert(int index, Object o) throws Exception {
        if (index < 0 || index > count) { //检查下标是否越界
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + count);
        }
        if (index == 0) { //插入首部
            Node n = new Node(); //将添加的元素封装为一个Node对象
            n.setPre(null);
            n.setObj(o);
            n.setNext(first);
            first.setPre(n); //将新节点设置为后继节点的前驱节点
            first = n;
        } else if (index == count) { //插入最后
            add(o);
        } else { //插入中间位置
            Node n = new Node(); //将添加的元素封装为一个Node对象
            Node pre = first;
            for (int i = 0; i < index - 1; i++) {
                pre = pre.getNext(); //找到指定的前驱节点
            }
            Node next = pre.getNext();
            n.setPre(pre);
            n.setObj(o);
            n.setNext(next);
            pre.setNext(n); //将新节点设置为前驱节点的后继节点
            next.setPre(n); //将新节点设置为后继节点的前驱节点
            count++; //维护计数器
        }
    }

    //链表长度
    public int getCount() {
        return count;
    }

    //遍历方法
    public void bianli() {
        Node n = first;
        while (n != null) {
            System.out.println(n.getObj());
            n = n.getNext();
        }
    }

}



class Test{
    public static void main(String[] args) throws Exception {
        MyLinkedList a = new MyLinkedList();
        a.add(68468);
        a.add(6846868);
        a.add("3");
        a.add("4");
        a.add("5");
        a.add("6");
        a.insert(0,58);
        a.insert(5,"hhh");
        System.out.println(a.get(4));
        System.out.println(a.newGet(6));
        a.bianli();


    }
}

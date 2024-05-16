/*
addFirst(E e): 在链表的头部添加一个元素。
java
public void addFirst(E e) {
    final Node<E> f = first;
    final Node<E> newNode = new Node<>(null, e, f);
    first = newNode;
    if (f == null)
        last = newNode;
    else
        f.prev = newNode;
    size++;
}
addLast(E e): 在链表的尾部添加一个元素。
java
public void addLast(E e) {
    final Node<E> l = last;
    final Node<E> newNode = new Node<>(l, e, null);
    last = newNode;
    if (l == null)
        first = newNode;
    else
        l.next = newNode;
    size++;
}
removeFirst(): 移除链表的头部元素。
java
public E removeFirst() {
    final Node<E> f = first;
    if (f == null)
        throw new NoSuchElementException();
    return unlinkFirst(f);
}

private E unlinkFirst(Node<E> f) {
    final E element = f.item;
    final Node<E> next = f.next;
    f.item = null;
    f.next = null;
    first = next;
    if (next == null)
        last = null;
    else
        next.prev = null;
    size--;
    return element;
}
removeLast(): 移除链表的尾部元素。
java
public E removeLast() {
    final Node<E> l = last;
    if (l == null)
        throw new NoSuchElementException();
    return unlinkLast(l);
}

private E unlinkLast(Node<E> l) {
    final E element = l.item;
    final Node<E> prev = l.prev;
    l.item = null;
    l.prev = null;
    last = prev;
    if (prev == null)
        first = null;
    else
        prev.next = null;
    size--;
    return element;
}
getFirst(): 获取链表的头部元素。
java
public E getFirst() {
    final Node<E> f = first;
    if (f == null)
        throw new NoSuchElementException();
    return f.item;
}
getLast(): 获取链表的尾部元素。
java
public E getLast() {
    final Node<E> l = last;
    if (l == null)
        throw new NoSuchElementException();
    return l.item;
}
clear(): 移除链表中的所有元素。
java
public void clear() {
    // Clearing all of the links between nodes is "unnecessary", but:
    // - helps a generational GC if the discarded nodes inhabit
    //   more than one generation
    // - is sure to free memory even if there is a reachable Iterator
    for (Node<E> x = first; x != null; ) {
        Node<E> next = x.next;
        x.item = null;
        x.next = null;
        x.prev = null;
        x = next;
    }
    first = last = null;
    size = 0;
}
clone(): 克隆一个和当前链表相同的链表。
java
@SuppressWarnings("unchecked")
public Object clone() {
    java进阶.Collection.list.LinkedList<E> clone = superClone();

    // Put clone into "virgin" state
    clone.first = clone.last = null;
    clone.size = 0;
    clone.modCount = 0;

    // Initialize clone with our elements
    for (Node<E> x = first; x != null; x = x.next)
        clone.add(x.item);

    return clone;
}
offer(E e): 在链表的尾部添加一个元素，相当于 addLast(E e)。
java
public boolean offer(E e) {
    return add(e);
}
offerFirst(E e): 在链表的头部添加一个元素，相当于 addFirst(E e)。
java
public boolean offerFirst(E e) {
    addFirst(e);
    return true;
}
offerLast(E e): 在链表的尾部添加一个元素，相当于 addLast(E e)。
java
public boolean offerLast(E e) {
    addLast(e);
    return true;
}
peek(): 获取链表的头部元素，但不移除。
java
public E peek() {
    final Node<E> f = first;
    return (f == null) ? null : f.item;
}
peekFirst(): 获取链表的头部元素，但不移除，相当于 getFirst()。
java
public E peekFirst() {
    final Node<E> f = first;
    return (f == null) ? null : f.item;
}
peekLast(): 获取链表的尾部元素，但不移除，相当于 getLast()。
java
public E peekLast() {
    final Node<E> l = last;
    return (l == null) ? null : l.item;
}
poll(): 移除并获取链表的头部元素。
java
public E poll() {
    final Node<E> f = first;
    return (f == null) ? null : unlinkFirst(f);
}
pollFirst(): 移除并获取链表的头部元素，相当于 removeFirst()。
java
public E pollFirst() {
    final Node<E> f = first;
    return (f == null) ? null : unlinkFirst(f);
}
pollLast(): 移除并获取链表的尾部元素，相当于 removeLast()。
java
public E pollLast() {
    final Node<E> l = last;
    return (l == null) ? null : unlinkLast(l);
}
push(E e): 在链表的头部添加一个元素，相当于 addFirst(E e)。
java
public void push(E e) {
    addFirst(e);
}
pop(): 移除并获取链表的头部元素，相当于 removeFirst()。
java
public E pop() {
    return removeFirst();
}
remove(Object o): 移除链表中从前往后第一个与 o 相同的元素。
java
public boolean remove(Object o) {
    if (o == null) {
        for (Node<E> x = first; x != null; x = x.next) {
            if (x.item == null) {
                unlink(x);
                return true;
            }
        }
    } else {
        for (Node<E> x = first; x != null; x = x.next) {
            if (o.equals(x.item)) {
                unlink(x);
                return true;
            }
        }
    }
    return false;
}
removeFirstOccurrence(Object o): 移除链表中从前往后第一个与 o 相同的元素，相当于 remove(Object o)。
java
public boolean removeFirstOccurrence(Object o) {
    return remove(o);
}
removeLastOccurrence(Object o): 移除链表中从后往前第一个与 o 相同的元素。
java
public boolean removeLastOccurrence(Object o) {
    if (o == null) {
        for (Node<E> x = last; x != null; x = x.prev) {
            if (x.item == null) {
                unlink(x);
                return true;
            }
        }
    } else {
        for (Node<E> x = last; x != null; x = x.prev) {
            if (o.equals(x.item)) {
                unlink(x);
                return true;
            }
        }
    }
    return false;
}
descendingIterator(): 返回一个从后往前遍历链表的迭代器。
java
public Iterator<E> descendingIterator() {
    return new DescendingIterator();
}

private class DescendingIterator implements Iterator<E> {
    private final ListItr itr = new ListItr(size());
    public boolean hasNext() {
        return itr.hasPrevious();
    }
    public E next() {
        return itr.previous();
    }
    public void remove() {
        itr.remove();
    }
}
iterator(): 返回一个从前往后遍历链表的迭代器。
java
public Iterator<E> iterator() {
    return new ListItr(0);
}

private class ListItr implements ListIterator<E> {
    private Node<E> lastReturned;
    private Node<E> next;
    private int nextIndex;
    private int expectedModCount = modCount;

    ListItr(int index) {
        // assert isPositionIndex(index);
        next = (index == size) ? null : node(index);
        nextIndex = index;
    }

    public boolean hasNext() {
        return nextIndex < size;
    }

    public E next() {
        checkForComodification();
        if (!hasNext())
            throw new NoSuchElementException();

        lastReturned = next;
        next = next.next;
        nextIndex++;
        return lastReturned.item;
    }

    public boolean hasPrevious() {
        return nextIndex > 0;
    }

    public E previous() {
        checkForComodification();
        if (!hasPrevious())
            throw new NoSuchElementException();

        lastReturned = next = (next == null) ? last : next.prev;
        nextIndex--;
        return lastReturned.item;
    }

    // 其他方法
}
这些是 java进阶.Collection.list.LinkedList 独有的方法。除此之外，java进阶.Collection.list.LinkedList 还实现了 Deque、Queue、Cloneable 和 Serializable 接口中的部分方法。
 */
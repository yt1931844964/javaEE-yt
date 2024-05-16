package java进阶.Collection.list.LinkedList.模拟;
  //模拟双向链表
public class Node {     //这是一个链表模拟节点
    //指示上一个元素地址
      private Node pre;
      //当前存入的元素
      private Object obj;
      //指向下一个元素地址
      private Node next;
      public Node(){

      }

      public Node getPre() {
          return pre;
      }

      public void setPre(Node pre) {
          this.pre = pre;
      }

      public Object getObj() {
          return obj;
      }

      public void setObj(Object obj) {
          this.obj = obj;
      }

      public Node getNext() {
          return next;
      }

      public void setNext(Node next) {
          this.next = next;
      }

      @Override
      public String toString() {
          return "Node{" +
                  "前元素地址=" + pre +
                  ", 此元素=" + obj +
                  ", 下一个元素地址=" + next +
                  '}';
      }
  }

package java进阶.TakeaWay;

import java.util.List;
   //对四个管理类进行操作
public interface DAO<T> {
    void insert(T t);
    T findById(String id);
    List<T> findAll();
    void delete(String id);
}

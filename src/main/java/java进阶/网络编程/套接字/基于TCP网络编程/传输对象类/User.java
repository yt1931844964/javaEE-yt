package java进阶.网络编程.套接字.基于TCP网络编程.传输对象类;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 4464135143144646L; //序列化
    private String id;
    private String pwd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public User(String id ,String pwd){
        this.id =id;
        this.pwd =pwd;
    }
}

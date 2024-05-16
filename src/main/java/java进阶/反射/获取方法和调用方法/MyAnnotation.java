package java进阶.反射.获取方法和调用方法;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Inherited //子类可以继承父类的注解了
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String[] value();
}
package java进阶.注解.元注解;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Inherited //子类可以继承父类的注解了
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String[] value();
}

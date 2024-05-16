package java进阶.注解.元注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface MyAnnotation2 {
    //可以不设置参数
}

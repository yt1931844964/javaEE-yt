package java进阶.注解.元注解;

import java.lang.annotation.Documented;

@Documented
public @interface MyAnnotation1 {
    String[] value() default "abc"; //可以使用默认参数
}

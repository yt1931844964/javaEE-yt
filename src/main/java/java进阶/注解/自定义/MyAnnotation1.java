package java进阶.注解.自定义;

public @interface MyAnnotation1 {
    String[] value() default "abc"; //可以使用默认参数
}

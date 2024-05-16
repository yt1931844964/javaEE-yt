package java进阶.反射.获取属性和对属性进行赋值;


import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Test {
    public static void main(String[] args) throws NoSuchFieldException, InstantiationException, IllegalAccessException {
        //获取运行时字节码信息
        Class cls =Student.class;
        //一、获取属性
        //（1）public修饰的
        Field[] fields = cls.getFields();
        for(Field f :fields){
            System.out.println(f);
        }
        System.out.println("--------------------");
        //（2）其他修饰符修饰的
        Field[] fields1 = cls.getDeclaredFields();
        for(Field f :fields1){
            System.out.println(f);
        }
        System.out.println("-----------------------");

        //二、获取指定属性
        Field name = cls.getField("name");//获取public修饰的
        System.out.println(name);
        System.out.println("---------------------");
        Field sex = cls.getDeclaredField("sex"); //获取非public修饰的
        System.out.println(sex);
        System.out.println("----------------------");

        //三、获取属性具体结构（修饰符，数据类型，名字）
        System.out.println(Modifier.toString(name.getModifiers()));
        Class clazz = name.getType();
        System.out.println(clazz.getName());
        String Name = name.getName();
        System.out.println(Name);
        System.out.println("----------------------");
        //给属性赋值
        Field name1 = cls.getField("name");//获取public修饰的
        Object obj = cls.newInstance();
        name1.set(obj, 1);
        System.out.println(obj);

    }
}

package java进阶.Generics泛型;

import java.util.List;

/*
泛型的优点在于可以提高代码的可读性和可维护性。通过使用泛型，可以将一些类型中的通用行为抽象出来，
并将这些行为封装到类和接口中。泛型还可以提高代码的安全性，可以避免一些类型转换错误，减少了运行时异常的发生。
 */
public class MyList<T> {
    private T[] elements;
    private int size;

    public MyList() {
        elements = (T[]) new Object[10];  //这其实是ArrayList底层数组以及元素占用空间
        size = 0;
    }
    public static <j> void a(j j) {  //在调用泛型方法时，编译器会根据传入的参数类型自动推断出 j 的类型。如果参数类型不符合规定，则会产生编译错误。
        System.out.println("这是一个真正的泛型方法");//可以是静态的
    }

    public boolean add(T element) {
        if (size < elements.length) {
            elements[size++] = element;
        }
        return true;


    }

    public T get(int index) {
        if (index >= 0 && index < size) {
            return elements[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
//通配符受限
class Container<T extends Number> {//这是一个泛型类 Container 的定义，用于存储类型为 T 的元素。
    // 其中，T 必须是 Number 类型或其子类型，使用了 extends 关键字限定上界。
    private List<T> elements;

    public void add(T element) {
        elements.add(element);
    }

    public double sum() {
        double sum = 0.0;
        for (T element : elements) {
            sum += element.doubleValue();
        }
        return sum;
    }
}
class A{
    public static void main(String[] args) {
        //不同类型的泛型引入不能相互赋值
        MyList<Object> list1 =  new MyList<>();//实例一个继承泛型
        MyList<String> list2 = new MyList<>();//<> 钻石符号 < > 表示让编译器自动推断泛型类型，方便代码的书写和阅读。
        //string是object是子类父类的关系，但是MyList<Object> 和MyList<String>不存在继承关系，是并列关系
        //引入通配符<?>
        MyList<?> list3 = new MyList<>(); //现在MyList<?>变成了MyList<Object> 和MyList<String>的父类，可以赋值
        list3 = list1;
        Boolean A = list1.add(44);
        System.out.println(A);


    }
}
/*
使用泛型是 Java 中非常重要的特性，可以提高代码的可读性和可维护性。下面介绍一些使用泛型时需要注意的细节：

泛型类型参数必须是引用类型，不能是基本类型。例如 int、double 等基本类型必须使用其对应的包装类 Integer、Double 等来作为泛型参数。
类型参数只在编译时有效，运行时不会保留类型参数的信息，这被称为类型擦除。因此，在运行时无法使用 instanceof 运算符来检查泛型类型的具体类型，
只能通过传递 Class 对象或类型标记等方式。
泛型类型参数可以有多重边界限定，使用 & 符号分隔多个限定。例如 <T extends Serializable & Comparable<? super T>>，
表示 T 必须是实现了 Serializable 接口，并且是一个 Comparable 类型的子类（或父类）。
泛型方法的类型参数可以与泛型类的类型参数不同，这被称为泛型方法的类型变量隐藏。在泛型方法中定义的类型参数只在方法内部有效，
并且不会影响类的类型参数。
通配符（wildcard）可以用来接受任何类型的参数，但是无法向其中添加元素。如果需要修改通配符类型的对象，需要使用通配符受限（bounded wildcard）
或具体的类型参数。
使用泛型时要注意类型的匹配关系，避免出现类型不匹配等错误。在使用通配符受限时，需要注意上下界的限定条件。
总之，在使用泛型时需要理解其原理和规则，并根据实际情况选择合适的方式来定义和使用泛型类、泛型方法和泛型类型参数，以提高代码的可读性和可维护性。
 */
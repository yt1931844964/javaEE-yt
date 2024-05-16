package java进阶.Generics泛型;
/*
定义泛型类 GenericDemo，使用 <T> 表示类型参数。
在类的定义中使用 extends 关键字限制泛型类型必须是 Number 的子类。
声明一个 private 类型为泛型类型参数 T 的变量 data，用来存储数据。
在类的构造函数中使用泛型类型参数 T 作为参数类型。
使用 T 作为返回值类型，定义 getData() 方法，用来访问 data 变量。
使用 T 作为参数类型，定义 setData() 方法，用来修改 data 变量。
使用 <E> 定义泛型方法 printArray，该方法接收一个泛型数组，并打印出数组中的所有元素。
在 main 方法中创建一个 GenericDemo 对象，指定类型参数为 Double。
调用 GenericDemo 对象的 getData() 方法，获取存储的数据。
声明三个不同类型的数组，分别是整型、双精度浮点数和字符串类型的数组。
调用 GenericDemo 对象的 printArray 方法，传入不同类型的数组。
 */
public class GenericDemo<T extends Number> {

    private T data;

    public GenericDemo(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 创建一个GenericDemo对象，指定类型参数为Double
        GenericDemo<Double> demo = new GenericDemo<>(3.14);
        System.out.println("data = " + demo.getData());

        // 调用printArray方法，传入不同类型的数组
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        String[] stringArray = { "Hello", "World" };

        demo.printArray(intArray);
        demo.printArray(doubleArray);
        demo.printArray(stringArray);
    }
}

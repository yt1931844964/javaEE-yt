package java进阶.枚举.应用举例;

public class Test {
    public static void main(String[] args) {
        Girl girl = new Girl();
        girl.setAge("18");
        girl.setName("晶晶");
        girl.setSex(Gender.女);
        System.out.println(girl);

        Gender sex =Gender.男;
        //switch()中可以传入枚举或：int byte char String short等
        switch (sex){
            case 女:
                System.out.println("女的");
                break;
            case 男 :
                System.out.println("男的");
                break;
        }


    }
}

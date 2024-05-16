package java进阶.枚举.实现接口;

public enum Person implements TestInterface { //这是常见的定义枚举的方式，省略了许多
    yesterday {
        @Override
        public void show() {
            System.out.println("昨日");
        }
    },
    today {
        @Override
        public void show() {
            System.out.println("今日");
        }
    };
    public void show(){
        System.out.println("我是帅");
    }



}

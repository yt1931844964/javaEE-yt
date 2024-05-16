package java进阶.枚举.自定义枚举;

public class Season {
    //特定的属性
    private final String Name;
    private final String Desc;

    private Season(String Name,String Desc){
        this.Desc=Desc;
        this.Name=Name;

    }
    //有限的确定的对象
    public static final Season SPRING = new Season("春天","春暖花开");
    public static final Season SUMMER = new Season("夏天","好热");
    public static final Season AUTUMN = new Season("秋天","好爽");
    public static final Season WINTER = new Season("冬天","好凉凉");

    public String getName() {
        return Name;
    }

    public String getDesc() {
        return Desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "季节名称='" + Name + '\'' +
                ", 季节特性='" + Desc + '\'' +
                '}';
    }
}

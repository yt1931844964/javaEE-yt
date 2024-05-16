package java进阶.枚举.Enum关键字创建;
public enum Season {   //继承自 java.util.Enum
    //有限的确定的对象必须放在开始的位置
     SPRING ("春天","春暖花开"),  //
     SUMMER ("夏天","好热"),
     AUTUMN ("秋天","好爽"),
     WINTER  ("冬天","好凉凉");
    //特定的属性
    private final String Name;
    private final String Desc;

   Season(String Name,String Desc){
        this.Desc=Desc;
        this.Name=Name;

    }


    public String getName() {
        return Name;
    }

    public String getDesc() {
        return Desc;
    }
/*  //内部有tostring（）
    @Override
    public String toString() {
        return "Season{" +
                "季节名称='" + Name + '\'' +
                ", 季节特性='" + Desc + '\'' +
                '}';
    }

 */
}

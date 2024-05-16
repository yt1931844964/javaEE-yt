package java基础.java入门;

public class
SuchFor {

    public static void main(String[] args) {
        String string=(3==8+8)?"false":"true";
        double number=34.5;
        //if循环
        if(number>90){
            System.out.println("90");
        }else if(number>80){
            System.out.println("80");
        }else{
            System.out.println("false");
        }

        //for循环
        for( int i=1;i<90;i++){
            number+=i;
            if(number==500){
                continue;
            }

        }
        System.out.println(number);

        //while循环  1-100和
        int num=1;
        int sum=0;
        while(num<=100){
            sum+=num;
            num++;


        }

        //do while 循环
        do{
            sum+=num;
            num++;
        }while(num<=100);

        //switch
        switch(num+9){
            case 1:
                System.out.println("shabi");
            case 2:
                System.out.println("shabi");
            case 10:
                System.out.println("true");
        }




    }
}

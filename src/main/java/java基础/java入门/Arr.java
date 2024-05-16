package java基础.java入门;

import java.util.Scanner;

public class Arr {
    public static void main(String[] args){
        //定义和创建
        int arr[]=new int[10];
        int length=arr.length; //len(arr)
        //求平均
        int sum=0;
        Scanner sc =new Scanner(System.in);
        for(int i=1;i<=10;i++){
            int score=sc.nextInt();
            arr[i-1]=score;
            sum+=arr[i-1];
        }
        double p=sum/length;
        System.out.println(p);


        //数组遍历
        for (int i=0;i<=9;i++){     //逆向（int i=9;i>=1;i--）
            System.out.println(arr[i]);
        }
        for(int num:arr){       //对arr遍历，每个元素都用num接收
            System.out.println(num);
        }



    }
    //求数组最大值函数（方法）
    public static int max(int []list){
        int max=list[0];
        for(int i=0;i<list.length;i++){
            if(list[i]>max){
                max=list[i];
            }

        }
        return max;
    }
}

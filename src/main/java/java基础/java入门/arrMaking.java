package java基础.java入门;

import java.util.Scanner;

public class arrMaking {
    public static  void main(String[] args) {
        //添加元素
        int arr[]=new int[5];
        int index=4; //插入位置
        Scanner sc=new Scanner(System.in);
        arr[index]= sc.nextInt();
        for(int i = arr.length-1; i>=(index+1); i--){
            arr[i]=arr[i-1];


        }


        //删除元素
        if(index!=-1){
            for(int i=index;i<=arr.length-2;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=0;  //被挤出去的最后一位

        }
        else{
            System.out.println("没有这个位置");
        }



    }
}

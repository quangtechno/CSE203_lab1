
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class question4 {
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        int size=reader.nextInt();
        int[] arr=new int[size];
        int result=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=reader.nextInt();
    }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                result+=arr[i];
            }
        }
        System.out.println(result);
}
}

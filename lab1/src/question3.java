
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class question3 {
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        int number=reader.nextInt();
        String line="odd";
        while(number!=1){
            int temp=number;
            if(number%2==0){
                number=number/2;
                line="even";
                System.out.println(temp+" is "+line+" , so we take 3*n+1: "+number);
            }else{
                number=(number*3)+1;
                line="odd";
                System.out.println(temp+" is "+line+" , so we take n/2: "+number );
            }
            
            
        }
    }
}


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class question1 {
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        int num=reader.nextInt();
       String line=Integer.toString(num);
      int num1=Integer.parseInt(line.substring(0, 1));
     int num2=Integer.parseInt(line.substring(line.length()-1, line.length()));
     int result=num1+num2;
     System.out.println(result);
     
      
       
       
      
    }
}

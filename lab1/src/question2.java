
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class question2 {
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        int number1=reader.nextInt();
        int number2=reader.nextInt();
        int number3=reader.nextInt();
        int result=Math.min(Math.min(number1, number2), number3);
        System.out.println(result);
    }
}

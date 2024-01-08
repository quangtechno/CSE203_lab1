
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class question6 {
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        String line=reader.nextLine();
        line=line.trim();
       int i=0;
        System.out.println(wordCount(line));
        System.out.println(checkPalidrome(line));
        System.out.println(concatenate(line, line));
    }
    static int wordCount(String line){
          line=line.trim();
       int i=0;
       boolean space=false;
       int word=0;
       while(i<line.length()){
           if(line.charAt(i)==' '){
               if(!space){
               word++;
               }
               space=true;
           }else{
               space=false;
           }
           i++;
       }
       word++;
       return word;
    }
    static boolean checkPalidrome(String line){
        
        int i=0;
        int j=line.length()-1;
        while(i<=j){
            if(line.charAt(i)!=line.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
       return true;
    }
    static String concatenate(String line1,String line2){
        String line=line1+line2;
         return line;
    }
    }


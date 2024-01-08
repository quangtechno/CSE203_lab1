
import java.util.Scanner;
import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class question5 {
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        int size=reader.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<size;i++){
            list.add(reader.nextInt());
        }
//        insertList(list, 99, 3);
        System.out.println(findDuplicate(list));
        System.out.println(removeDuplicate(list));
    }
    static boolean deleteFirst(ArrayList<Integer> list){
        if(list.isEmpty()){
            return false;
        }else{
            list.remove(0);
            return true;
        }
    }
    static void insertList(ArrayList<Integer> list,int number,int position){
        list.remove(list.size()-1);
        list.add(position, number);
}
    static ArrayList<Integer> findDuplicate(ArrayList<Integer> list){
        ArrayList<Integer> duplicate=new ArrayList<Integer>();
        ArrayList<Integer> removeduplicate=new ArrayList<Integer>();
        for(int i=0;i<list.size();i++){
            if(removeduplicate.contains(list.get(i))){
                if(!duplicate.contains(list.get(i))){
               duplicate.add(list.get(i));
                }
            }else{
                removeduplicate.add(list.get(i));
            }
    }
      return duplicate;
}
    static ArrayList<Integer> removeDuplicate(ArrayList<Integer> list){
        ArrayList<Integer> duplicate=new ArrayList<Integer>();
        ArrayList<Integer> removeduplicate=new ArrayList<Integer>();
        for(int i=0;i<list.size();i++){
            if(removeduplicate.contains(list.get(i))){
                if(!duplicate.contains(list.get(i))){
               duplicate.add(list.get(i));
                }
            }else{
                removeduplicate.add(list.get(i));
            }
    }
      return removeduplicate;
}
}

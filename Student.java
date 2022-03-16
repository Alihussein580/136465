/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import java.util.*;

/**
 *
 * @author Babli
 */
public class Student {

    
    public static void main(String[] args) {
        String name;
        String [] subject = new String[5];
        int [] mark = new int[5];
        char [] grade = new char[5];
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter Student Name : ");
        name = input.nextLine();
        System.out.println("Student name is " + name);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Subject Name" + (i + 1) + ":");
            subject[i] = input.nextLine();
            }
        for(int j = 0; j < 5;j++) {
            System.out.println("Enter marks for " + subject[j] + ":");
            
            mark[j] = input.nextInt();
            if(mark[j] < 40){
                grade[j] = 'F';
            }else if(mark[j] >=40 && mark[j] < 50) {
                grade[j] = 'D';
            }else if(mark[j] >= 50 && mark[j] < 60) {
                grade[j] = 'C';
            }else if (mark[j] >= 60 && mark[j] < 70) {
                grade[j] = 'B';
            }else if (mark[j] >= 70 && mark[j] <=100) {
                grade[j]= 'A';
            }else{
                do{
                    System.out.println(" Invalid marks for " + subject[j] + ".Enter again :");
                    mark[j] = input.nextInt();
                    
                }while(mark[j] < 0 && mark[j] > 100);
            }
        }
        for(int k = 0;k < 5;k++) {
            System.out.println(subject[k] + " : " + mark[k] + " : " + grade[k]  );
        }
        
    }
    
}

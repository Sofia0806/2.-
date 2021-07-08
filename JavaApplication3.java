/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Введите размер: ");
        int n = in.nextInt();
        int[] a= new int[n];
        System.out.println("Ввод эоементов: ");
        for(int i=0; i<n; i++) {
         a[i] = in.nextInt();
      }
        
            for(int i=0; i<a.length; i++) {
         for (int j=i+1; j<a.length; j++) {
            if(a[i] == a[j]) {
               System.out.println("Дубликат: ");
               System.out.println(a[j]);
            }
            
         }
         
            }
            
       
       //System.out.println(n);
    }
    
}

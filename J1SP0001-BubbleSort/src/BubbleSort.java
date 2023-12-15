import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class BubbleSort {
    
    
   public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //nhap chuoi
        System.out.println("Enter number of array: ");
        int n = sc.nextInt();
        int[] arr = new int [n];
        
        //random so trong chuoi
        for(int i = 0; i<n ; i++){
            double randomDouble = Math.random();
            randomDouble = randomDouble*10+1;
            int randomInt = (int) randomDouble;
            arr[i] = randomInt;
        }
        System.out.print("Unsorted list");
         display(arr);
         
         bubleSort(arr);
         System.out.print("sorted list");
         display(arr);
    }
    
    
    
       public static int[] bubleSort(int[] arr){
        int tmp;
        int n = arr.length;
        for(int i = 0; i< n-1; i++){
            for(int j = 0; j< n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
           return arr;
    }  
    
   public static void display(int[] arr){             
       int size = arr.length;
       int indexEnd =size-1;
       System.out.print("[");
       for(int i = 0; i< size ; i ++){
           System.out.print(arr[i]);
           if(i != indexEnd ){
               System.out.print(", ");
           }
       }
       System.out.println("]");
}

}

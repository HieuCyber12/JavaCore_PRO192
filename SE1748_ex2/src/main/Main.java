package main;

import java.util.Scanner;

/**
 *
 * @author HieuSA
 */

public class Main {
    
    public static int RemoveDuplicates(int a[], int n)
    {
       
        // creating another array for only storing
        // the unique elements
        int[] temp = new int[n];
        int j = 0;
 
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
 
        temp[j++] = a[n - 1];
 
        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
 
        return j;
    }
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;   
      
        //Check condiction of n
        do{
            System.out.print("Enter number of elements: ");
            n = Integer.parseInt(sc.nextLine());
            if(n < 0) System.out.println("ERROR: Must enter n > 0!!");
        }
        while(n < 0);
        //Input ele into arr
        int [] a = new int[n];
        for(int i = 0; i < n ; i++){
            System.out.format("Enter a[%d]: ",i);
            a[i] = Integer.parseInt(sc.nextLine());
        }
        
        //Display arr
       System.out.println("Display Array: ");
       for(int i = 0; i < n; i++){
            System.out.print(a[i] + ",");
        }
       int max = a[0];
       //Find max
       for(int i = 0; i< n; i++){
           if(max < a[i]){
               max = a[i];
           }
       }
       System.out.println("\nMax: " + max);
       
       //Sorted arr by bubble sort
        System.out.println("Sorted Array: ");
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (a[j] > a[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
        
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + ",");
        }
       
        n = RemoveDuplicates(a, n);
        System.out.println("\nRemoved Dupliate Array: ");
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + ",");
        }
        
        String [] words = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        System.out.println("\nArray in words: ");
        for(int i = 0; i < n; i++){
            System.out.print(words[a[i]]+ ", ");
        }
    }
    
}

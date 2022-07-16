import java.util.Arrays;
import java.util.Scanner;

public class arrayClass {
    public static void main(String[] args) {
        // int a[]  ={21,44,66,45,23,45};
        // //for print one element
        // System.out.println(a[2]);
        
        // //for print all element in the array
        // //we are useing for each loop
        // for(int b:a){
        //     System.out.print(b + " ");
        // }

        // input array
        // int a[] = new int[5];
        // System.out.println("Enter the array element :");
        // Scanner obj = new Scanner(System.in);
        // for(int i=0; i<a.length; i++){
        //     a[i]=obj.nextInt();
        // }
        // System.out.println("Your array as you entered: ");

        // for(int b:a){
        //     System.out.print(b+" ");
        // }
        // Arrays.sort(a);
        // System.out.println("\nSorted array: ");
        
        // for(int b:a){
        //     System.out.print(b+" ");
        // }
        


        //2d array
        int a[][] = new int[2][2];
        System.out.println("Enter the array element :");
        Scanner obj = new Scanner(System.in);
        //for input  we'r using nested for loop

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                a[i][j]=obj.nextInt();
            }
        }
        System.out.println("Your array as you entered: ");  
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }      
        


    }
    
}

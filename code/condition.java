
import java.util.Scanner;

public class condition {
    public static void main(String args) {
        Scanner obj = new Scanner(System.in);

        

        //if statement  -->


        // System.out.println("Enter the password");
        // int password;
        // password = obj.nextInt();
        // if(password == 1234)//if this is true 
        // 
        //     System.out.println("name : Dhrubaraj Roy");
        //     System.out.println("age : 21");
        //     System.out.println("fav coding lag : JAVA");
        //     System.out.println("Actor(char) : Chrish(Thor)");
        //     System.out.println("vill : Gokulnagar");
        // }
        // else
        // {
        //     System.out.println("Sorry!! wrong password...");
        // }




        //else if statement -->

        // System.out.println("Enter your money: ");
        // int moeny;
        // moeny = obj.nextInt();
        // if(moeny >= 5000 && moeny <= 9999){
        //     System.out.println("You can by Micromax mobile");
        // }
        // else if(moeny >= 10000 && moeny <= 14999 ){
        //     System.out.println("You can by Realme mobile");

        // }
        // else if(moeny >= 15000 && moeny < 20000){
        //     System.out.println("You can by samgsung mobile");

        // }
        // else{
        //     System.out.println("enter valid money");

        // }


        //Nested if-else -->

            System.out.println("Enter 3 number: ");
            System.out.println("a: ");
            int a = obj.nextInt();
            System.out.println("b: ");
            int b = obj.nextInt();
            System.out.println("c: ");
            int c = obj.nextInt();
            if(a > b){
                if(a > c){
                    System.out.println("a is gretest");
                }
                else{
                    System.out.println("c is gretest");
                }

            }
            else{
                if(b > c){
                    System.out.println("b is gretest");
                }
                else{
                    System.out.println("c is gretest");
                }
            }
           
            
    }
}

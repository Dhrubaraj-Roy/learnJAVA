import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args) {

        System.out.println("For  addition  = 1:");
        System.out.println("For  multipication  = 2:");
        System.out.println("For  sub  = 3:");
        System.out.println("For  mod  = 4:");
        System.out.println("For  div  = 5:");
        System.out.println("Enter hte chose: ");
        Scanner obj  =new Scanner(System.in);

        int ch = obj.nextInt();


        System.out.println("Enter two number: ");
                
        int a,b,c;
        a = obj.nextInt();
        b = obj.nextInt();
        switch(ch){
            case 1: c = a+b;
            System.out.println(c);
            break;

            case 2: c = a*b;
            System.out.println(c);
            break;
            case 3: c = a-b;
            System.out.println(c);
            break;
            case 4: c = a%b;
            System.out.println(c);
            break;
            case 5: c = a/b;
            System.out.println(c);
            break;
            default:
            System.out.println("Invalid chose");


        }

    }
    
}

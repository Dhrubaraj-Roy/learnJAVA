
import java.util.Scanner; //you need to import this package and the scanner class comes into util package

public class inputOutput {
//input & output
//input -> Scanner class (java.util.Scanner)
    public static void main(String[] args) {
            int a,b,c;
            System.out.println("Enter two number: ");
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = a + b;
            System.out.println("the sum of two num is : " + c);
    }
    
}

public class ternary_op {
    public static void main(String[] args) {
        int a,b,c,r;
        a=10;
        b=20;
        c=30;
        r = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(r);
        //another programe
        //source
        //https://www.javatpoint.com/ternary-operator-in-java
        int x, y;  
        x = 20;  
        y = (x == 1) ? 61: 90;  
        System.out.println("Value of y is: " +  y);  
        y = (x == 20) ? 61: 90;  
        System.out.println("Value of y is: " + y); 
    } 
    
    
}

public class logical_op {
    public static void main(String[] args) {
        int a,b;
        a=10;
        b=20;
        System.out.println(a==b && a!=b);//false bcoz tow condition should be true
        
        System.out.println(a==b || a!=b);//true bcoz only one condition should be true

        System.out.println(!(a>b));//this work reverse

    }
    
}

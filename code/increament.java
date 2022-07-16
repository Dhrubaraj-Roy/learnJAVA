public class increament {
    public static void main(String[] args) {
        
        int a = 10;

        //pre increament, pre dicreament  and post increament , post dicreament op
        System.out.println(a++);//10 --> 11
        System.out.println(++a);//12
        System.out.println(a--);//12 --> 11
        System.out.println(--a);//10

        //compaund assiment operator
        a+=10;
        System.out.println("compaund assiment operator: "+a);//20
        

    }
    
}

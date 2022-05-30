public class instanceStaticBlock {
    int a = 10;
    static int b = 20;
    {//instance block
        System.out.println("Java is easy "+a+b);

    }
    static {//static block
        System.out.println("I am a best coder!!"+b);
    }



    public static void main(String[] args) {
        instanceStaticBlock r = new instanceStaticBlock();
        
    }
    
}

public class exceptionHendling {
    public static void main(String[] args) {
        System.out.println("Program start");
        int a=10,b=0,c;
        try{
        c=a/b;
        System.out.println(c);
        }
        catch(Exception e) {
            System.out.println("Can not div by zero "+ e);

        }
        System.out.println("Program ended");

        
    }
    
}

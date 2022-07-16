abstract class animal 
{
    void legs(){
        System.out.println("This animal have 4 legs");
    }
    abstract void sound();
    abstract void eat();

}
class dog extends animal{
    @Override
    void sound(){
        System.out.println("bhow....bhow....");
    }
    void eat(){
        System.out.println("eating meat");
    }
}
class cat extends animal{
    @Override
    void sound(){
        System.out.println("meo...meo...");
    }
    void eat(){
        System.out.println("eating fish");
    }
}
public class abstraction {
    public static void main(String[] args) {
        dog d = new dog();
        cat c = new cat();
        d.legs();
        d.sound();
        d.eat();
        c.legs();
        c.sound();
        c.eat();
    }
    
}

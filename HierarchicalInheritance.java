import java.util.Scanner;
class A{
    void inputName(){
        // String name;
        System.out.println("Enter Your name");
        // name = s.nex
    }
    

}
class B extends A{
    void show(){
        System.out.println("................");
    }

}
class C extends A{
    void dis(){
        System.out.println("ccccccc..........");
    }

}
class HierarchicalInheritance{
    public static void main(String[] args) {
        
        // Scanner s = new Scanner(System.in);
        B r = new B();
        C r2 = new C();
        r.inputName();
        r.show();
        r2.dis();
        
        
    }
}
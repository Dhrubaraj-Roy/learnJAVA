class A{
    int a;
    String name;
    //this is my created constractor
    A(){
        a = 1;
        name = "Dhruba";
    } //the default value will a = 0; name = null;
    void display(){
        System.out.println(a+" "+name);
    }
}

public class constractor {
    public static void main(String[] args) {
        A P = new A();
        P.display();
    }
}

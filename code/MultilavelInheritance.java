class A{
    int a,b,c;
    void add(){
        a=10;
        b=20;
        c=a+b;
        System.out.println("Sum of tow numbers: "+c);
    }
    void rem(){
        a=10;
        b=3;
        c=a%b;
        System.out.println("Rem of tow numbers: "+c);
    }

}
class B extends A{
    void mul(){
        a=10;
        b=20;
        c=a*b;
        System.out.println("mul of tow numbers: "+c);
    }

}
class C extends B{
    void div(){
        a=10;
        b=5;
        c=a/b;
        System.out.println("div of tow numbers: "+c);
    }

}
class MultilavelInheritance{
    public static void main(String[] args) {
        C r = new C();
        r.add();
        r.mul();
        r.rem();
        r.div();

    }

    public void show() {
    }
}
//MultilavelInheritance
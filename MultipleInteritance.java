interface A{
    void show();
}
interface B{
    void show();
}
class MultilavelInheritance implements A,B {
    public void show(){
        System.out.println("Interface A and B");
    }
    public static void main(String[] args) {
    MultilavelInheritance m = new MultilavelInheritance();
    m.show();
    }

}
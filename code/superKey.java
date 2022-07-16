//VAARIABLE

// class A{
//     int a = 10;

// }
// class B extends A{
//      int a = 200;
//     void show(){
//          System.out.println(super.a);// output = 10
//          System.out.println(a);// output = 200

//     }
// }

//METHOD
// class A{
//     void show(){
         
//         System.out.println("One tohught should in your mind ");
//     }

// }
// class B extends A{
//     void show(){
//         System.out.println("Hello Guys");
//         super.show();

//     }
// }

//CONSTRUCTOR
class A{
    A(int a){
         
        System.out.println("One tohught should in your mind "+ a);
    }

}
class B extends A{
    B(){
        //super() autometically created.......but it will created only default constuctor
        super(100);
        System.out.println("Hello Guys");

    }
}


public class superKey {
    public static void main(String[] args) {
        B r = new B();
        
    }
    
}

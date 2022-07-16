

class A{
    int x,y;

    A(int a, int b){        //You must pass one or more parameters that's why it is Parametrised Constructor
        x=a;
        y=b;

    }
    A(int c, String d){
        
        System.out.println(c+" "+d);

    }
    void show(){
        System.out.println(x+" "+y);
    }
}
public class paraConstructor {
    
    public static void main(String[] args) {
        A r = new A(100,500);
        r.show();
        A ref = new A(2323,"Dhruba");

        
    }
}

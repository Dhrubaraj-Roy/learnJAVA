public class thisKeyword {
    int a;//instance variable 
    thisKeyword(){//local var
        //System.out.println("Java is easy");
        this(10000);

    }
    thisKeyword(int a){//local var
        //this();
        this.a=a;


    }
    void show(){
        System.out.println(a);
    }

    
    public static void main(String[] args) {
        thisKeyword r = new thisKeyword();
        //System.out.println(r);
        r.show();
        
    }
    
}

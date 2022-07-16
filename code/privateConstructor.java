public class privateConstructor {
    int  a; String b;
    private privateConstructor(){
        a=100;
        b="Hello guys";
        System.out.println(a+" "+b);


    }


    public static void main(String[] args) {
        privateConstructor r = new privateConstructor();
    }
        
    }
    


class shape{
    
    void draw(){
        System.out.println("Can't say shape");
    }
    
}
class circle extends shape{
    @Override
    void draw(){
        //super.draw();
        System.out.println("This is : Circle");
    }

}

public class runtimePoly {
    public static void main(String[] args) {
        shape r = new circle();
        r.draw();
        
    }

    
}

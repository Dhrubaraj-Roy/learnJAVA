class Person {
    int age = 21;
    int weight = 45;
    void eat(){
        System.out.println("He is eating");
    }
    void sleep(){
        System.out.println("He is sleeping");
    }
}

public class classAndObj {

   
    public static void main(String[] args) {
        Person P = new Person();
       System.out.println(P.age);
        P.eat();
        
    }
    
    
}


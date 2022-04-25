package learnJAVA.code;
class first {
    int a = 10; //instance variable
    static int b = 11;  // this is static variable  we can access without creating any object.
    public static void main(String args[]){
        System.out.println("How to access instance variable:");
        // System.out.println(a); error coz if access this a you need to creat a object 
        first access = new first();
        System.out.println(access.a);
        System.out.println(b); //this is static variable  we can access without creating any object.
    }
    
}
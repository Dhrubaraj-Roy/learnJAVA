class A extends Thread{
    public void fun(){
        try{
            for(int i = 0; i<5; i++){
                System.out.println("Dhrubaaaaa");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException  i){

        }
        
    }
}

public class thread {

    public static void main(String[] args) throws InterruptedException {
        A r = new A();
        r.fun();
        for(int i = 0; i<5; i++){
            System.out.println("Dhruvvvvvvvv");
            Thread.sleep(1000);

        }
    }
     
}

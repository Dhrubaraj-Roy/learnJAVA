import java.util.ArrayDeque;

public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> name  =new ArrayDeque<>();   //FIFO
        name.push("Dhruba");
        name.push("Tom");
        name.push("Sayon");
        name.push("Sura");
        System.out.println(name);
        name.pop();
        System.out.println(name);    
    }
}

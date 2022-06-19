import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<String> name  =new Stack<>();     //LIFO
        name.push("Dhruba");
        name.push("Tom");
        name.push("Sayon");
        name.push("Sura");
        System.out.println(name);
        name.pop();
        System.out.println(name);    
    }
}

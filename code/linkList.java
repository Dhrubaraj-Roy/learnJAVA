import java.util.LinkedList;

public class linkList {
    public static void main(String[] args) {
        LinkedList<String> name  =new LinkedList<String>();
        name.add("Dhruba");
        name.add("Tom");
        name.add("Sayon");
        name.add("Sura");
        name.addFirst("Prasen");
        name.add(0, "Biky");
        name.addLast("Avi");
        name.remove(0);
        System.out.println(name);

        name.removeLast();
        System.out.println(name);

        for(String str: name){
            System.out.println(str);
        }


    }
    
}

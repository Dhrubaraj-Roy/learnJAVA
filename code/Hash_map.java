import java.util.*;
class Hash_map{
    public static void main(String[] args) {
        System.out.println("hey");
        HashMap<String, Integer> languages = new HashMap<>();

    // add elements to hashmap
    languages.put("Java", 1);
    languages.put("JavaScript", 1);
    languages.put("Python", 3);
    languages.put("Dhruba", 2);
    languages.remove("Java");
    System.out.println("HashMap: " + languages);
    System.out.println("the keys: "+ languages.keySet());
    }
    
}
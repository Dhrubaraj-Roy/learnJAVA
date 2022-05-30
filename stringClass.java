public class stringClass {
    public static void main(String[] args) {
        //source
        //https://www.scientecheasy.com/2020/05/string-in-java.html/


        String str = "Dhruba";// they are created in the String_constant_pull(SOP) of heap memory
        String str2 =new String("Dhruba");// they are created in heap memory
        String str3 = "Dhruba";// they are created in the String_constant_pull(SOP) of heap memory
        // int l = str.length();
        // System.out.println(l);
        // System.out.println(str.toUpperCase());
        // System.out.println(str.toLowerCase());

        //check those string are same or not
        // if(str==str2){
        //     System.out.println("equal");
        // } else{
        //     System.out.println("Not equal");
        // }
        //this will return equal bcoz they are created in the String_constant_pull(SOP) of heap memory
        // if(str==str3){
        //     System.out.println("equal");
        // } else{
        //     System.out.println("Not equal");
        // }
        //interesting part here we see one method that is equal and equal only check the content of the string

        // if(str.equals(str2)){
        //     System.out.println("equal");//this will exicuted bcoz content are same
        // } else{
        //     System.out.println("Not equal");
        // }
        str3 = "Ram";
        System.out.println(str3);

    }
    
}

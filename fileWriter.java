import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
    public static void main(String[] args) {
        try{
            FileWriter f = new FileWriter("C:\\Users\\roydh\\Desktop\\Dhrrr.txt");
            try{
                f.write("Hello guys I am Dhrubaraj Roy");
            }
            finally{
                f.close();
            }
            System.out.println("Successfully created and written");
        }
        catch(IOException i){
            System.out.println(i);
        }
    }
    
}


// import java.io.*;

// public class createdFile {
//     public static void main(String[] args) {
//         File f = new File("C:\\Users\\roydh\\Desktop\\dhruba2.txt");
//         try{
//             if(f.createNewFile()){
//                 System.out.println("File created....!");
    
//             }
//             else{
//                 System.out.println("File already exsit");
    
    
//             }

//         }
//         catch(IOException i){
//             System.out.println(i);

//         }
        
//     }
    
// }

import java.io.*;

public class createdFile {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\roydh\\Desktop\\dhruba2.txt");
        
            if(f.createNewFile()){
                System.out.println("File created....!");
    
            }
            else{
                System.out.println("File already exsit");
    
    
            } 
        
    }
    
}

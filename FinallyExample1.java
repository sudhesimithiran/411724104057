// // import java.io.BufferedReader;
// // import java.io.FileReader;

// // public class FinallyExample1 {
// //     public static void main(String[] args) {
// //         BufferedReader br;
// //         br = new BufferedReader(new FileReader("d:\\data.txt"));
// //         String str;
// //         while ((str = br.readLine()) != null) {
// //             System.out.println(str);
// //             str = br.readLine();
// //         }
// //           br.close();
// //     }
    
// // }
// import java.io.BufferedReader;
// import java.io.FileReader;
//  import java.io.IOException;

// public class FinallyExample1 {
//     public static void main(String[] args) throws IOException {

//         BufferedReader br = null;

//         try {
//             br = new BufferedReader(new FileReader("Data.txt"));
//             String str;

//             while ((str = br.readLine()) != null) {
//                 System.out.println(str);
//                 str = br.readLine();
//             }
//         } 
//         catch (Exception e) {
//             e.printStackTrace();
//         } 
//         finally {
//             // try {
//                 if (br != null) br.close();
                
//             // } 
//             // catch (IOException e) {
//                 // e.printStackTrace();
//             // }
//         }
//     }
// }
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyExample1 {
    public static void main(String[] args) {

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("data1.txt"));
            String str = br.readLine();

            while (str != null) {
                System.out.println(str);
                str = br.readLine();
            }

        } catch (FileNotFoundException fe) {
            System.out.println("file not found");
            // fe.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
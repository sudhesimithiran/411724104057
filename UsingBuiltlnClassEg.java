import java.util.*;
public class UsingBuiltlnClassEg {
    public static void main(String[] args) {
    //     Scanner s = new Scanner(System.in);
    //     while (s.hasNextLine()) {
    //         System.out.println(s.nextLine());
    //         HAS
    //     }
        
    // }

//    String input = new StringBuilder()
//         .append("Michael Jackson\n")
//         .append("He was the 'king of pop'.\n").toString();
//         Scanner sc = new Scanner(input); 
//         String name  = sc.nextLine();
//         String description = sc.next();
//         System.out.println(name);
//         System.out.println(description);
//         sc.close();


// String input = new StringBuilder()
// .append("Michael jackson,whitney Houston,John cena\n")
// .append("Elvis Presley\n")
// .toString();

Scanner sc = new Scanner(new File("Data.txt"));
String uname = "jeeva";

sc.useDelimiter(", ");
while ((sc.hasNext())) {
    System.out.println(sc.next());
    
}
    }
    
}

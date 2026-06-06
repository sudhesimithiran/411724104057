public class Pattern {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) { 
//             for (int j = 1; j <= 5; j++) {
//                 if (i % 2 == 1)
//                     System.out.print("* ");
//                 else
//                     System.out.print("# ");
//             }       
//             System.out.println();
//         }
//     }
// }   


    public static void main(String[] args) {

        int n = 5;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {

                if(i == j || i + j == n - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
//package ExpectionHandling;

public class Exceptioneg4 {
    public static void main(String[] args) {

        try {
            try {
                System.out.println(10 / 0);
            } 
            catch (ArithmeticException e) {
                e.printStackTrace();
            }

            int[] a = new int[5];
            a[4] = 10;

            String str = null;
            System.out.println(str.length());

            int n = Integer.parseInt("abc");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("in main..");
    }
}
   
//        try { 
//         dostuff();
//        }
//        catch(ArithmeticException e) {
//         System.out.println("arthimetic expection \n"+e);
        
//     }
//     catch(ArrayIndexOutOfBoundsException e){
//         System.out.println("array index expection\n"+e);

//     }
//     System.out.println("in main..");
// }


    


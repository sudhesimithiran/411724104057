class college {
     static final String name = "PSVPEC" ;

    
}
public class FinalExample2 {
    
        static final double bal;
        static String college = "PSVPE";
        static{

        bal=400;
        college="PDKV";
        System.out.println("static block....");

        }

        public static void main(String[] args) {
            
        

          System.out.println(FinalExample2.bal);
          System.out.println(college);
    }
}

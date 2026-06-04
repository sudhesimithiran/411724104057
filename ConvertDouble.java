public class ConvertDouble {
    public static void main(String[] args) {
        double a= 65.28;
        int b= (int) a;         
        int c= (int) ((a-b) * 100);
        System.out.println(b+ " " +c);
    }
}
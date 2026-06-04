import java.util.Arrays;
public class Array{
    // public static void main(String[] args){
    //     int a[]={1,2,3};
    //     System.out.println(System.identityHashCode(a));
    //     a = new int[] {5,6,7};
    //     System.out.println(System.identityHashCode(a));
    //     int b[]=a;
    //     System.out.print(System.identityHashCode(b));
    // }
    
    static int sumarray(int b[]){
        int sum =0;
        for (int i = 0; i < b.length; i++) {
            sum = sum + b[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumarray(new int[]{45,6,7}));
        System.out.println(sumarray(new int[]{44,6,7}));
    }
}
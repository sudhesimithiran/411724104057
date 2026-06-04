class MyMath {=

    public static long digitReverse(long n) {
        long rev = 0;
        for (; n > 0; n /= 10) {
            rev = rev * 10 + n % 10;
        }
        return rev;   
    }

    public static void main(String[] args) {
        long n = 456;
        long r = MyMath.digitReverse(n);

        System.out.println(n);
        System.out.println(r);
    }
}

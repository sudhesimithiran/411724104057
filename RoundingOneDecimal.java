public class RoundingOneDecimal {
    public static void main(String[] args) {
        //ROUNDING TO 1 DECIMAL PLACE
        // double value1 = 65.28;
        // double value2 = 65.23;
        // double result1 = Math.round(value1 * 10) / 10.0;
        // double result2 = Math.round(value2 * 10) / 10.0;
        // System.out.println("Value 1: "+result1);
        // System.out.println("Value 2: "+result2);

        //ROUNDING  TO 1 POSITION
        double value1 = 125.60;
        double value2 = 125.3;
        double round1 = Math.round(value1);
        double round2 = Math.round(value2);
        System.out.printf("Value 1: %.2f\n", round1);
        System.out.printf("Value 2: %.2f\n", round2);
    }
}
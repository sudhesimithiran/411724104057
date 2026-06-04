class InstanceExample {
    public static void main(String[] args) {

        Object data = "Hello";

        if (data instanceof String) {
            System.out.println("Data is a valid String");
        } else {
            System.out.println("Invalid Data Type");
        }
    }
}
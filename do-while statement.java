public class newClass {
    public static void main(String[] args) {

        int a = 25;
        int b = 5;
        boolean isMultiplied = false;
        do {
            int c = a * b;
            System.out.println("The result is " +c);
            isMultiplied = true;
            break;
        } while (isMultiplied);
    }
}

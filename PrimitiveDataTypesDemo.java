public class PrimitiveDataTypesDemo {
    public static void main(String[] args) {
        // int data type
        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.println("Sum of int values (a + b): " + sum);

        // float data type
        float f1 = 5.5f;
        float f2 = 2.2f;
        float division = f1 / f2;
        System.out.println("Division of float values (f1 / f2): " + division);

        // char data type
        char letter = 'A';
        char nextLetter = (char)(letter + 1); // ASCII increment
        System.out.println("Original char: " + letter);
        System.out.println("Next char: " + nextLetter);

        // boolean data type
        boolean isJavaFun = true;
        boolean isHard = false;
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is Java hard? " + isHard);
    }
}

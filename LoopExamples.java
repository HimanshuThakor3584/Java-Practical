public class LoopExamples {
    public static void main(String[] args) {

        // FOR LOOP: Print numbers from 1 to 10
        System.out.println("Using for loop (1 to 10):");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // line break

        // WHILE LOOP: Print even numbers from 2 to 20
        System.out.println("\nUsing while loop (even numbers from 2 to 20):");
        int j = 2;
        while (j <= 20) {
            System.out.print(j + " ");
            j += 2;
        }
        System.out.println(); // line break

        // DO-WHILE LOOP: Print numbers from 10 to 1
        System.out.println("\nUsing do-while loop (10 to 1):");
        int k = 10;
        do {
            System.out.print(k + " ");
            k--;
        } while (k >= 1);

        System.out.println(); // final line break
    }
}

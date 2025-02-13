public class Main {
    public static void main(String[] args) {

        for (int number = 1; number <= 10; number++) {
            System.out.println("Multiplication Table for " + number + ":");


            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + (number * i));
            }


            System.out.println();
        }
    }
}
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("How many stars would you like?");
        Scanner scan = new Scanner(System.in);
        int numOfStars = scan.nextInt();

        for (int i = 1; i <= numOfStars; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = numOfStars; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
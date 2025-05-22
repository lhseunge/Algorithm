import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int index = scanner.nextInt();

        System.out.println(word.charAt(index - 1));

    }
}

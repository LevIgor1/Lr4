import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.print("Введіть 1 число: ");
        a = scanner.nextInt();
        System.out.print("Введіть 2 число: ");
        b = scanner.nextInt();

        Random random = new Random();
        int ra = random.nextInt(6) + 1, rb = random.nextInt(6) + 1;
        System.out.println("Кості комп'ютера: " + ra + ", " + rb);

        if (a + b > ra + rb)
            System.out.println("Виграв гравець!!!");
        else if (a + b < ra + rb)
            System.out.println("Виграв комп'ютер!!!");
        else
            System.out.println("Нічия");

        scanner.nextLine(); // Доданий цей рядок для очищення буфера введення

        System.out.print("Введіть рядок: ");
        String input = scanner.nextLine();

        if (isNumeric(input)) {
            double number = Double.parseDouble(input);
            if (number > 0) {
                System.out.println("Число додатне.");
            } else if (number == 0) {
                System.out.println("Нуль.");
            } else {
                System.out.println("Число від'ємне.");
            }
        } else {
            System.out.println("Не вдалося розпізнати число.");
        }

        scanner.close();
    }

    // Функція для перевірки, чи рядок є числом без використання ісключень
    private static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        int startIndex = 0;
        if (str.charAt(0) == '-' || str.charAt(0) == '+') {
            startIndex = 1;
        }
        boolean decimalPointSeen = false;
        for (int i = startIndex; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '.') {
                if (decimalPointSeen) {
                    return false;
                }
                decimalPointSeen = true;
            } else if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}

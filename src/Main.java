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


    }
}
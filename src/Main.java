import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество слов в телеграмме:");
        int wordCount = scanner.nextInt();

        System.out.println("Введите стоимость одного слова:");
        double costPerWord = scanner.nextDouble();

        double totalCost = wordCount * costPerWord;

        System.out.println("Квитанция об оплате телеграммы:");
        System.out.println("Стоимость: " + totalCost);
    }
}
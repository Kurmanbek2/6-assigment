import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите выражение (например: 45 / 3): ");
        String input = scanner.nextLine(); // Считываем строку целиком

        // Разделяем строку по пробелам
        String[] parts = input.split("\\s+");

        if (parts.length < 3) {
            System.out.println("Ошибка: неверный формат ввода.");
            return;
        }

        double num1 = Double.parseDouble(parts[0]);
        String operator = parts[1];
        double num2 = Double.parseDouble(parts[2]);
        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль!");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Ошибка: неизвестный оператор.");
                return;
        }

        System.out.println("Input: " + input);
        // Если результат — целое число, выводим без дробной части
        if (result == (int) result) {
            System.out.println("Output: " + (int) result);
        } else {
            System.out.println("Output: " + result);
        }
    }
}
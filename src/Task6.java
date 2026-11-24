public class Task6 {
    public static void main(String[] args) {
        String input = "abc123de45";
        // Заменяем все цифры на пустую строку с помощью регулярного выражения
        String output = input.replaceAll("[0-9]", "");

        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}
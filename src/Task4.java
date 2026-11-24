public class Task4 {
    public static void main(String[] args) {
        String input = "this is a test";
        // Разделяем строку по одному или нескольким пробелам
        String[] words = input.trim().split("\\s+");
        int count = input.trim().isEmpty() ? 0 : words.length;

        System.out.println("Input: " + input);
        System.out.println("Output: Words = " + count);
    }
}
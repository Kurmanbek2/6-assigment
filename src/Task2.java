public class Task2 {
    public static void main(String[] args) {
        String input = "hello world";
        int count = 0;
        String lower = input.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                    count++;
                }
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Output: Consonants = " + count);
    }
}
public class Task9 {
    public static void main(String[] args) {
        String input = "madam";
        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println("Input: " + input);
        if (input.equals(reversed)) {
            System.out.println("Output: Palindrome");
        } else {
            System.out.println("Output: Not a Palindrome");
        }
    }
}
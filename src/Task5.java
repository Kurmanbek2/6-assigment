public class Task5 {
    public static void main(String[] args) {
        String input = "aabbcddee";
        char result = '_';

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (input.indexOf(ch) == input.lastIndexOf(ch)) {
                result = ch;
                break;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }
}
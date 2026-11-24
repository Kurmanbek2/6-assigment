public class Task10 {
    public static void main(String[] args) {
        String input = "I love programming";
        String[] words = input.split("\\s+");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Output: " + longest);
    }
}
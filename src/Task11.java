public class Task11 {
    public static void main(String[] args) {
        String input = "I love programming";
        String[] words = input.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                sb.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        String output = sb.toString().trim();
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}
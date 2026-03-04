public class ReverseWords {
    public static void main(String[] args) {

        String input = "java string";
        String[] words = input.split(" ");
        String output = "";

        for (String word : words) {
            String reversed = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }
            output += reversed + " ";
        }

        System.out.println(output.trim());
    }
}

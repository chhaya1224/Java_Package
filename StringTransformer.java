public class StringTransformer {
    public static void main(String[] args) {
        String input = "My name is so and so";
        
        // Step 1: Replace spaces with hyphens
        String transformed = input.replace(" ", "-");
        
        // Step 2: Wrap with curly braces
        transformed = "{" + transformed + "}";
        
        System.out.println(transformed);
    }
}

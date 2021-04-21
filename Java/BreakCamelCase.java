
public class BreakCamelCase {
    public static void main(String[] args) {
        System.out.println(Solution.camelCase("camelCasing"));
    }
}

class Solution {
    public static String camelCase(String input) {
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            String c = Character.toString(input.charAt(i));
            if (c.equals(c.toUpperCase())) out.append(" ");
            out.append(c);
        }
        return out.toString();
    }
}

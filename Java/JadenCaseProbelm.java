
/**
 * JadenCase
 */
public class JadenCaseProbelm {
    public static void main(String[] args) {
        JadenCaseProbelm jadenCase = new JadenCaseProbelm();
        String jadenStr = jadenCase.toJadenCase("check for a valid letter after the space");
        System.out.println(jadenStr);
    }

    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.equals(""))
            return null;

        char[] array = phrase.toCharArray();

        for (int x = 0; x < array.length; x++) {
            if (x == 0 || array[x - 1] == ' ') {
                array[x] = Character.toUpperCase(array[x]);
            }
        }

        return new String(array);
    }
}
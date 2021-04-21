public class PangramCheck {
    public static void main(String[] args) {
        PangramCheck pangram = new PangramCheck();
        pangram.check("Test");
    }

    public boolean check(String sentence) {
        boolean[] chars = new boolean[26];
        sentence = sentence.toLowerCase();

        int index = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if ('a' <= sentence.charAt(i) && sentence.charAt(i) <= 'z') {
                index = sentence.charAt(i) - 'a';
                System.out.println(index);
                chars[index] = true;
            }
        }
        
        for (boolean c : chars) {   
            if (!c) {
                return false;
            }
        }
        return true;
    }
}

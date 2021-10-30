import java.util.Locale;

public class Main {
    private static final int CHARACTER_RANGE = 256; //Ascii total character number.
    public static void main(String[] args) {
        System.out.println(isAnagram("Keep", "Peek"));
    }

    public static boolean isAnagram(String string1, String string2) {
        string1 = string1.toLowerCase(Locale.ROOT);
        string2 = string2.toLowerCase(Locale.ROOT);

        if (string1.length() != string2.length()) {
            return false;
        }
        int count[] = new int[CHARACTER_RANGE];
        for (int i = 0; i < string1.length(); i++) {
            count[string1.charAt(i)]++;
            count[string2.charAt(i)]--;
        }
        for (int i = 0; i < CHARACTER_RANGE; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}

package LeetCode;

public class LowerCase {

    public static void main(String[] args) {
        System.out.print(toLowerCase("Rahul#HelLLO BSD 67 #22"));
    }

    public static String toLowerCase(String str) {
        String toLowerCase = "";
        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i);
            if (c >= 65 && c <= 90) {
                c = c + 32;
            }
            toLowerCase = toLowerCase + (char) c;
        }
        return toLowerCase;
    }
}

package LeetCode;

public class RegExpMatch {

    public static void main(String[] args) {

        String a = "Rhul";
        String e = "ahul";

        System.out.print(a.charAt(1));
        System.out.print(e.indexOf(a.charAt(1)));

    }

    public static int numJewelsInStones(String J, String S) {
        int numJewelStones = 0;

        for (String s : S.split("")) {

            if (J.contains(s)) {
                numJewelStones++;
            }
        }
        return numJewelStones;
    }


    public static int numJewelsInStones_v2(String J, String S) {
        int numJewelStones = 0;

        for(int i =0; i< S.length(); i++){
            if(J.indexOf(S.charAt(i))>-1){
                numJewelStones++;
            }
        }
        return numJewelStones;
    }
}

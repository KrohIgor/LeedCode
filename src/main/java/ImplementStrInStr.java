public class ImplementStrInStr {

    public static void main(String[] args) {
        System.out.println(new ImplementStrInStr().strStr("aaaaaa","bba"));
    }

    public int strStr(String haystack, String needle) {
        StringBuilder str = new StringBuilder(haystack);
        return str.indexOf(needle);
    }
}

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"aa", "a"}));
    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder();
        if (strs.length == 0){
            return str.toString();
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            boolean charsEquals = true;
            for (int j = 1; j < strs.length; j++) {
                if (i > strs[j].length() - 1
                        || strs[j].charAt(i) != c) {
                    charsEquals = false;
                    break;
                }
            }
            if (charsEquals) {
                str.append(c);
            } else {
                break;
            }
        }
        return str.toString();
    }
}

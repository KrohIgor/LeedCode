public class CountAndSay {

    public static void main(String[] args) {
        System.out.println(new CountAndSay().countAndSay(7));
    }

    public String countAndSay(int n) {
        String start = "1";
        return buildSequence(start, 1,  n);
    }

    public String buildSequence(String string, int term, int n) {
        if (term == n) {
            return string;
        }
        int counter = 1;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (i != string.length() - 1 && string.charAt(i) == string.charAt(i+1)) {
                counter++;
            } else {
                stringBuilder.append(counter).append(string.charAt(i));
                counter = 1;
            }
        }
        return buildSequence(stringBuilder.toString(), ++term, n);
    }
}

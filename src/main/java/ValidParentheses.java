public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("[)"));
    }

    public boolean isValid(String s) {
        boolean correct = true;
        StringBuilder stringBuilder = new StringBuilder(s);
        while (stringBuilder.length() > 0) {
            if (!correct) {
                return false;
            }
            if (stringBuilder.charAt(0) == '(' || stringBuilder.charAt(0) == '[' || stringBuilder.charAt(0) == '{') {
                if (stringBuilder.length() > 1) {
                    correct = isValidParentheses(stringBuilder.charAt(0), stringBuilder.deleteCharAt(0));
                    if (correct) {
                        stringBuilder.deleteCharAt(0);
                    } else {
                        return false;
                    }
                } else {
                    correct = false;
                }
            } else {
                correct = false;
            }
        }
        return correct;
    }

    private boolean isValidParentheses(char charAt, StringBuilder stringBuilder) {
        if (stringBuilder.length() == 0) {
            return false;
        }
        if (stringBuilder.charAt(0) == '(' || stringBuilder.charAt(0) == '[' || stringBuilder.charAt(0) == '{') {
            if (stringBuilder.length() > 1) {
                if (isValidParentheses(stringBuilder.charAt(0), stringBuilder.deleteCharAt(0))) {
                    stringBuilder.deleteCharAt(0);
                    return isValidParentheses(charAt, stringBuilder);
                }
            } else {
                return false;
            }
        } else {
            if (charAt == '(') {
                return stringBuilder.charAt(0) == ')';
            } else if (charAt == '[') {
                return stringBuilder.charAt(0) == ']';
            } else {
                return stringBuilder.charAt(0) == '}';
            }
        }
        return false;
    }
}

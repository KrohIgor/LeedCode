public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(new RomanToInteger().romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        char[] romanNumberArray = s.toCharArray();
        int result = 0;
        for (int i = 0; i < romanNumberArray.length; i++) {
            int number = represent(romanNumberArray[i]);
            if (i < romanNumberArray.length - 1) {
                int nextNumber = represent(romanNumberArray[i + 1]);
                if (number < nextNumber){
                    result += (nextNumber - number);
                    i++;
                    continue;
                }
            }
            result += number;
        }
        return result;
    }

    private int represent(char c) {
        switch (c) {
            case 'I' :
                return 1;
            case 'V' :
                return 5;
            case 'X' :
                return 10;
            case 'L' :
                return 50;
            case 'C' :
                return 100;
            case 'D' :
                return 500;
            case 'M' :
                return 1000;
        }
        return 0;
    }
}

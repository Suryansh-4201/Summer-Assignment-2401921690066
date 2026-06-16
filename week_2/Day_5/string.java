package week_2.Day_5;
class StringCompression {
    public int compress(char[] chars) {

        int index = 0; // write pointer
        int i = 0;     // read pointer

        while (i < chars.length) {

            char currentChar = chars[i];
            int count = 0;

            // count same characters
            while (i < chars.length && chars[i] == currentChar) {
                count++;
                i++;
            }

            // write character
            chars[index++] = currentChar;

            // write count if greater than 1
            if (count > 1) {
                String strCount = String.valueOf(count);

                for (char c : strCount.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }
}
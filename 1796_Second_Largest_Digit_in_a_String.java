class Solution {
    public int secondHighest(String s) {
        int l = -1;
        int sl = -1;

        for (char ch : s.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                int digit = ch - '0';

                if (digit > l) {
                    sl = l;
                    l = digit;
                } else if (digit < l && digit > sl) {
                    sl = digit;
                }
            }
        }

        return sl;
    }
}

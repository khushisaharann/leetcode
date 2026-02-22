class Solution {
    public int binaryGap(int n) {
        String s = Integer.toBinaryString(n);
        int max = 0;
        for (int i = 0; i < s.length()-1; i++) {
            int j = i + 1;
            if(s.charAt(i) == '1') {
                while (j < s.length() && s.charAt(j) != '1') {
                    j++;
                }
                if (j < s.length() && s.charAt(j) == '1') {
                    max = Math.max(max, j - i);
                }
            }
        }
        return max;
    }
}
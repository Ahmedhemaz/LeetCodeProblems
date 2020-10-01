class Solution {
    public void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < s.length; i++, j--) {
            this.swap(s, i, j);
            if (i == (s.length / 2) - 1)
                break;
        }

    }

    public void swap(char[] s, int from, int to) {
        char temp;
        temp = s[from];
        s[from] = s[to];
        s[to] = temp;
    }
}
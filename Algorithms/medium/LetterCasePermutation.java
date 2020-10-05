class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> stringsArray = new ArrayList<>();
        this.letterCasePermutationHelper(S, 0, stringsArray);
        return stringsArray;
    }

    private void letterCasePermutationHelper(String s, int ch, List<String> list) {
        if (ch == s.length()) {
            list.add(s);
            return;
        }
        if (Character.isLetter(s.charAt(ch))) {
            letterCasePermutationHelper(
                    s.substring(0, ch) + Character.toUpperCase(s.charAt(ch)) + s.substring(ch + 1, s.length()), ch + 1,
                    list);
            letterCasePermutationHelper(
                    s.substring(0, ch) + Character.toLowerCase(s.charAt(ch)) + s.substring(ch + 1, s.length()), ch + 1,
                    list);
        } else {
            letterCasePermutationHelper(s, ch + 1, list);
        }

    }
}
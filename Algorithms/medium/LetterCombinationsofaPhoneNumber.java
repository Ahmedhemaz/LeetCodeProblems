class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> letters = new ArrayList<>();
        if (digits.length() == 0)
            return letters;
        HashMap<Character, String> hashmap = new HashMap<>();
        hashmap.put('2', "abc");
        hashmap.put('3', "def");
        hashmap.put('4', "ghi");
        hashmap.put('5', "jkl");
        hashmap.put('6', "mno");
        hashmap.put('7', "pqrs");
        hashmap.put('8', "tuv");
        hashmap.put('9', "wxyz");

        if (digits.length() == 1) {
            String firstDigitLetters = hashmap.get(digits.charAt(0));
            for (int i = 0; i < firstDigitLetters.length(); i++) {
                letters.add(Character.toString(firstDigitLetters.charAt(i)));
            }
            return letters;
        }
        this.letterCombinationsHelper(digits, "", 0, hashmap, letters);
        return letters;
    }

    private void letterCombinationsHelper(String digits, String builtString, Integer index,
            HashMap<Character, String> stringsMap, List<String> letters) {
        if (builtString.length() == digits.length()) {
            letters.add(builtString);
            return;
        }
        String chosenString = stringsMap.get(digits.charAt(index));
        for (int i = 0; i < chosenString.length(); i++) {
            String newbuiltString = builtString + Character.toString(chosenString.charAt(i));
            letterCombinationsHelper(digits, newbuiltString, index + 1, stringsMap, letters);
        }

    }
}
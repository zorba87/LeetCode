class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        
        if(digits == null || digits.length() == 0){
            return ans;
        }
        String[] lettersMap = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        dfs(ans, new StringBuilder(), digits, lettersMap, 0);

        return ans;     
    }

    private void dfs(List<String> ans, StringBuilder sb , String digits, String[] letterMap, int i) {
        if (i == digits.length()) {
            ans.add(sb.toString());
            return;
        }

        int num = digits.charAt(i) - '0';
        String numStr = letterMap[num - 2];

        for (int j = 0; j < numStr.length(); j++) {
            sb.append(numStr.charAt(j));
            dfs(ans, sb, digits, letterMap, i + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
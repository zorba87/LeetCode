class Solution {
    // public String reverseWords(String s) {
       
    //     String res = "";
    //     String ns = s.trim();
    //     String s1 = ns.replaceAll("[\\s]+", " ");

    //     ArrayList<String> list = new ArrayList<>();
    //     String[] s2 = s1.split(" ");
        
    //     for (String sub: s2) {
    //         list.add(sub);
    //     }
    //     Collections.reverse(list);
    //     StringBuilder sb = new StringBuilder();

    //     for (String sub: list) {
    //         sb.append(sub+" ");
    //     }
    //     res = sb.toString().trim();

    //     return res;
    
    // }
    public String reverseWords(String s) {
        // Trim the input string to remove leading and trailing spaces
        String[] str = s.trim().split("\\s+");

        // Initialize the output string
        String out = "";

        // Iterate through the words in reverse order
        for (int i = str.length - 1; i > 0; i--) {
            // Append the current word and a space to the output
            out += str[i] + " ";
        }

        // Append the first word to the output (without trailing space)
        return out + str[0];
    }
}
public class LongestCommonPrefix {
    /**
     * This function finds the longest common prefix among an array of strings.
     *
     * @param strs An array of strings.
     * @return The longest common prefix string, or an empty string if no common prefix exists.
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return ""; // No common prefix for an empty array
        }

        String prefix = strs[0]; // Initialize the prefix with the first string

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return ""; // No common prefix found
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefix solution = new LongestCommonPrefix();

        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};

        String result1 = solution.longestCommonPrefix(strs1);
        String result2 = solution.longestCommonPrefix(strs2);

        System.out.println("Input 1: " + Arrays.toString(strs1));
        System.out.println("Output 1: " + result1);

        System.out.println("Input 2: " + Arrays.toString(strs2));
        System.out.println("Output 2: " + result2);
    }
}

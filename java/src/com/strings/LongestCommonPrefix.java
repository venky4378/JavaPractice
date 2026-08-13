package com.strings;
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0)
            return "";

        // Take first string as reference
        String first = strs[0];

        for (int i = 0; i < first.length(); i++) {

            char ch = first.charAt(i);

            // Compare with remaining strings
            for (int j = 1; j < strs.length; j++) {

                // If index exceeds current string length
                // OR characters don't match
                if (i == strs[j].length() || strs[j].charAt(i) != ch) {
                    return first.substring(0, i);
                }
            }
        }

        // Entire first string is common
        return first;
    }

    public static void main(String[] args) {

        String[] arr = {"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(arr));
    }
}
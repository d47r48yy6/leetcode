class Solution {
    public int lengthOfLastWord(String s)
    {
        String trimmedString = s.trim();

        // Find the index of the last space character
        int lastSpaceIndex = trimmedString.lastIndexOf(' ');

        // Extract the substring starting from last space index + 1
        String lastWord = trimmedString.substring(lastSpaceIndex + 1);

        // Return the length of the last word
        return lastWord.length();
    }
}
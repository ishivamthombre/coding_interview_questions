public class getLongestSubstringFromAllArrayObjects {
  public static void main(String[] args) {
    // Write a function to find the longest common prefix string amongst an array of strings.
    // If there is no common prefix, return an empty string "".
    //Example 1:
    //Input: strs = ["flower","flow","flight"]Output: "fl"
    //Example 2:
    //Input: strs = ["dog","racecar","car"]Output: ""Explanation: There is no common prefix among the input strings.

    String[] str = {"flower", "flow", "flight"};
    System.out.println("longest sub strting :  " + longestSubString(str));
  }

  private static String longestSubString(String[] str) {
    if (str == null)
      return "no longest sub string";

    String prefix = str[0]; //base value
    for (int i = 1; i < str.length; i++) { //loop for all the words
      while (str[i].indexOf(prefix) != 0) {// keep trimming until it matched to prefix
        prefix = prefix.substring(0, prefix.length() - 1);
        if (prefix.isEmpty())
          return "";
      }
    }
    return prefix;
  }
}

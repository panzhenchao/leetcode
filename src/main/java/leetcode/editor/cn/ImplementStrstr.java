package leetcode.editor.cn;

//实现 strStr() 函数。 
//
// 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如
//果不存在，则返回 -1 。 
//
// 说明： 
//
// 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。 
//
// 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与 C 语言的 strstr() 以及 Java 的 indexOf() 定义相符。 
//
// 
//
// 示例 1： 
//
// 
//输入：haystack = "hello", needle = "ll"
//输出：2
// 
//
// 示例 2： 
//
// 
//输入：haystack = "aaaaa", needle = "bba"
//输出：-1
// 
//
// 
//
// 提示： 
//
// 
// 1 <= haystack.length, needle.length <= 10⁴ 
// haystack 和 needle 仅由小写英文字符组成 
// 
// Related Topics 双指针 字符串 字符串匹配 👍 1508 👎 0

public class ImplementStrstr{
    public static void main(String[] args) {
    	
        Solution solution = new ImplementStrstr().new Solution();
        String haystack="hello";
        String needle="ll";
        System.out.println(solution.strStr(haystack,needle));
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int strStr(String haystack, String needle) {
        int haystackSize = haystack.length();
        int needleSize = needle.length();
        if (needleSize == 0) {
            return 0;
        }
        if(needleSize>haystackSize){
            return -1;
        }
        char[] haystackChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();
        for (int i = 0; i < haystackSize-needleSize+1; i++) {

            int right = 0;
            if (haystackChars[i] == needleChars[right]) {
                if (check(haystackChars, needleChars, i)) {
                    return i;
                }
            }
        }
        return -1;

    }

    public boolean check(char[] haystackChars, char[] needleChars, int k) {

        for (int b = 0; b < needleChars.length; b++) {
            if (needleChars[b] != haystackChars[b + k]) {
                return false;
            }
        }
        return true;
    }
}

//leetcode submit region end(Prohibit modification and deletion)
}

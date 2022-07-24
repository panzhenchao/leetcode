package leetcode.editor.cn;

//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 
//
// 示例 1： 
//
// 
//输入：strs = ["flower","flow","flight"]
//输出："fl"
// 
//
// 示例 2： 
//
// 
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。 
//
// 
//
// 提示： 
//
// 
// 1 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] 仅由小写英文字母组成 
// 
// Related Topics 字符串 👍 2354 👎 0

public class LongestCommonPrefix{
    public static void main(String[] args) {
    	
        Solution solution = new LongestCommonPrefix().new Solution();
        String[] strs=new String[]{"dog","racecar","car"};
        System.out.println(solution.longestCommonPrefix(strs));
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        //找到长度最短的
        String a=strs[0];
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<a.length()){
               a= strs[i];
            }
        }
        if(a ==null||a==""){
            return a;
        }
        int b=a.length();
        for(int i=0;i<strs.length;i++){
            int check = check(strs[i], a);
            b=b>check?check:b;
        }
        return a.substring(0,b);

    }
    private int check(String a,String b){
        int i=0;
        for(i=0;i<b.length();i++){
            if(b.charAt(i)!=a.charAt(i)){
                return i;
            }
        }
        return i;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}
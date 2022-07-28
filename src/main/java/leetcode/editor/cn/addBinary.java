//给你两个二进制字符串，返回它们的和（用二进制表示）。 
//
// 输入为 非空 字符串且只包含数字 1 和 0。 
//
// 
//
// 示例 1: 
//
// 输入: a = "11", b = "1"
//输出: "100" 
//
// 示例 2: 
//
// 输入: a = "1010", b = "1011"
//输出: "10101"
//
// 
//
// 提示： 
//
// 
// 每个字符串仅由字符 '0' 或 '1' 组成。 
// 1 <= a.length, b.length <= 10^4 
// 字符串如果不是 "0" ，就都不含前导零。 
// 
// Related Topics 位运算 数学 字符串 模拟 👍 851 👎 0

package leetcode.editor.cn;

import java.util.Arrays;

class addBinary{
    //2022-07-28 19:09:39
    //二进制求和
    //编号：[67]
    
    public static void main(String[] args) {
        Solution solution = new addBinary().new Solution();
        // TO TEST
        String a="1010";
        String b="1011";
        System.out.println(solution.addBinary(a,b));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addBinary(String a, String b) {
        String min="";
        String max="";
        if(a.length()<b.length()){
            min=a;
            max=b;
        }else {
            min=b;
            max=a;
        }
        int defunt=0;
        String bb="";
        for(int i=max.length()-1;i>=0;i--){
            int minIndex = i - (max.length() - min.length());

            int minInt=minIndex>=0?Integer.valueOf(min.charAt(minIndex)+""):0;
            int maxInt=Integer.valueOf(max.charAt(i)+"");
            int num=(defunt+minInt+maxInt)%2;
            defunt=(defunt+minInt+maxInt)>=2?1:0;
            bb=num+bb;
            if(i==0&&defunt==1){
                bb=1+bb;
            }
        }
        return bb;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
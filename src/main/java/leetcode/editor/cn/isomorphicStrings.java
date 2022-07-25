////给定两个字符串 s 和 t ，判断它们是否是同构的。 
////
//// 如果 s 中的字符可以按某种映射关系替换得到 t ，那么这两个字符串是同构的。 
////
//// 每个出现的字符都应当映射到另一个字符，同时不改变字符的顺序。不同字符不能映射到同一个字符上，相同字符只能映射到同一个字符上，字符可以映射到自己本身。 
//
////
//// 
////
//// 示例 1: 
////
//// 
////输入：s = "egg", t = "add"
////输出：true
//// 
////
//// 示例 2： 
////
//// 
////输入：s = "foo", t = "bar"
////输出：false 
////
//// 示例 3： 
////
//// 
////输入：s = "paper", t = "title"
////输出：true 
////
//// 
////
//// 提示： 
////
//// 
////
//// 
//// 1 <= s.length <= 5 * 10⁴ 
//// t.length == s.length 
//// s 和 t 由任意有效的 ASCII 字符组成 
//// 
//// Related Topics 哈希表 字符串 👍 487 👎 0
//

package leetcode.editor.cn;

import java.util.Calendar;
import java.util.HashMap;
import java.util.logging.Handler;

class isomorphicStrings{
    //2022-07-25 13:39:36
    //同构字符串
    //编号：[205]
    
    public static void main(String[] args) {
        Solution solution = new isomorphicStrings().new Solution();
        // TO TEST
        String s="egg";
        String t="add";
        System.out.println(solution.isIsomorphic(s,t));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()==0||t.length()==0){
            return false;
        }
           char[]aChars= s.toCharArray();
            char[]tChars= t.toCharArray();
            HashMap<Character, Character> aMap=new HashMap<>();
            HashMap<Character, Character> tMap=new HashMap<>();
            for(int i=0;i<aChars.length;i++){
                Character t1 = aMap.get(aChars[i]);
                Character a1 = tMap.get(tChars[i]);
                if(t1==null|| t1==' '){
                    aMap.put(aChars[i],tChars[i]);

                }else {
                    if(!t1.equals(tChars[i])){
                        return false;
                    }
                }
                if(a1==null|| a1==' '){
                    tMap.put(tChars[i],aChars[i]);
                }else {
                    if(!a1.equals(aChars[i])){
                        return false;
                    }
                }


            }
            return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
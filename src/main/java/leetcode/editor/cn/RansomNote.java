package leetcode.editor.cn;

//给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。 
//
// 如果可以，返回 true ；否则返回 false 。 
//
// magazine 中的每个字符只能在 ransomNote 中使用一次。 
//
// 
//
// 示例 1： 
//
// 
//输入：ransomNote = "a", magazine = "b"
//输出：false
// 
//
// 示例 2： 
//
// 
//输入：ransomNote = "aa", magazine = "ab"
//输出：false
// 
//
// 示例 3： 
//
// 
//输入：ransomNote = "aa", magazine = "aab"
//输出：true
// 
//
// 
//
// 提示： 
//
// 
// 1 <= ransomNote.length, magazine.length <= 10⁵ 
// ransomNote 和 magazine 由小写英文字母组成 
// 
// Related Topics 哈希表 字符串 计数 👍 403 👎 0

import java.util.HashMap;

public class RansomNote{
    public static void main(String[] args) {
    	
        Solution solution = new RansomNote().new Solution();
        String ransomNote="bb";
        String magazine="b";
        System.out.println(solution.canConstruct(ransomNote,magazine));
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length()){
            return false;
        }
        HashMap<Character,Integer> magazineMap= new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            putMap(magazineMap,magazine.charAt(i));
        }
        for(int i=0;i<ransomNote.length();i++){
            boolean check=canGetMap(magazineMap,ransomNote.charAt(i));
            if(!check){
                return false;
            }
        }
        return true;
    }
    public void putMap(HashMap<Character,Integer> map,Character c){
        Integer orDefault = map.getOrDefault(c, 0);
        map.put(c,orDefault+1);
    }
    public boolean canGetMap(HashMap<Character,Integer> map,Character c){
        Integer orDefault = map.getOrDefault(c, 0);
        if(orDefault<1){
            return false;
        }else {
            map.put(c,orDefault-1);
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
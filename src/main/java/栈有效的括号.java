//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "()"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：s = "()[]{}"
//输出：true
// 
//
// 示例 3： 
//
// 
//输入：s = "(]"
//输出：false
// 
//
// 示例 4： 
//
// 
//输入：s = "([)]"
//输出：false
// 
//
// 示例 5： 
//
// 
//输入：s = "{[]}"
//输出：true 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 104 
// s 仅由括号 '()[]{}' 组成 
// 
// Related Topics 栈 字符串 
// 👍 2547 👎 0


import java.util.*;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public static void main(String[] args) {
        System.out.println(isValid("(("));
    }

    public static boolean isValid(String s) {
        String[] str = s.split("");
        Deque<String> stack = new LinkedList<>();
        List<String> leftList = new ArrayList<>(Arrays.asList("(", "[", "{"));
        List<String> rightList = new ArrayList<>(Arrays.asList(")", "]", "}"));

        if (str.length % 2 != 0) {
            return false;
        }

        for (int i = 0; i < str.length; i++) {
            if (leftList.contains(str[i])) {
                stack.push(str[i]);
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                int index = rightList.indexOf(str[i]);
                String right = stack.pop();
                if (!right.equals(leftList.get(index))) {
                    return false;
                }
            }
        }
        if (stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

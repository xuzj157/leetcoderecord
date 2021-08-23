//数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。 
//
// 有效括号组合需满足：左括号必须以正确的顺序闭合。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 3
//输出：["((()))","(()())","(())()","()(())","()()()"]
// 
//
// 示例 2： 
//
// 
//输入：n = 1
//输出：["()"]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 8 
// 
// Related Topics 字符串 动态规划 回溯 
// 👍 1964 👎 0


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution22 {

    public static void main(String[] args) {
        generateParenthesis(0);
    }


    public static List<String> generateParenthesis(int n) {
        List<String> rtnList = new ArrayList<>();
        a("", 0, n, rtnList);
        return rtnList;
    }

    public static void a(String s, int rightRemain, int leftRemain, List<String> rtnList) {
        //terminator
        if (leftRemain == 0 && rightRemain == 0) {
            System.out.println(s);
            rtnList.add(s);
            return;
        }
        //process
        if (leftRemain != 0) {
            a(s + "(", rightRemain + 1, leftRemain - 1, rtnList);
        }
        if (rightRemain != 0) {
            a(s + ")", rightRemain - 1, leftRemain, rtnList);
        }
        //drill down
        //reverse states
    }
}
//leetcode submit region end(Prohibit modification and deletion)

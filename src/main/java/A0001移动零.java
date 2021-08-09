/**
 * @author xuzj157
 * @date 2021/7/29 19:52
 */
public class A0001移动零 {

    /**
     * 一维数组的指针交换
     *
     * @param args
     */

    public static void main(String[] args) {
        A0001移动零.moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }
        }
    }


}

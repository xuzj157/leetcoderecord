/**
 * @author xuzj157
 * @date 2021/7/29 19:52
 */
public class A0002盛最多水的容器 {

    public static void main(String[] args) {
        A0002盛最多水的容器.maxArea(new int[]{0, 1, 0, 3, 12});
    }

    /**
     * 枚举法
     *
     * @param height
     * @return
     */
    public static int maxArea(int[] height) {
        int areaRtn = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int area = (j - i) * Math.min(height[i], height[j]);
                areaRtn = Math.max(area, areaRtn);
            }
        }
        return areaRtn;
    }

}

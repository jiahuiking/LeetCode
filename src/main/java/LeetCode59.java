import java.util.Arrays;

/**
 * ClassName: LeetCode59
 * Package: PACKAGE_NAME
 * Description:螺旋矩阵 II
 *
 * @Author: Dust
 * @Create 2023/11/12 13:09
 * @Version 1.0
 */
public class LeetCode59 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateMatrix(3)));
    }

    /**
     * 生成矩阵
     * @param n 矩阵的行数和列数
     * @return 生成的矩阵
     */
    public static int[][] generateMatrix(int n) {
        int loop = 0;
        int[][] result = new int[n][n];
        int start = 0;
        int count = 1;
        int i, j;
        while (loop++ < n / 2) {
            for (j = start; j < n - loop; j++) {
                result[start][j] = count++;
            }
            for (i = start; i < n - loop; i++) {
                result[i][j] = count++;
            }
            for (; j >= loop; j--) {
                result[i][j] = count++;
            }
            for (; i >= loop; i--) {
                result[i][j] = count++;
            }
            start++;
        }
        if (n % 2 == 1) {
            result[start][start] = count;
        }
        return result;
    }
}


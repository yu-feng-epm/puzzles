/**
 * Question:
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * 
 * Constraints: 1 <= n <= 45
 */
public class LeetCode70 {
    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return climbStairs(n - 1) + climbStairs(n - 2);
        }

    }
    public static void main(String[] args) {
        for (int i = 3; i <= 5; i++) {
            System.out.println("n = " + i + ", result = " + climbStairs(i));
        }
    }
}
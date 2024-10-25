public class IterativeSolution {
    public int sumInteger(int n){
        int z = 0;
        for(int i = 0; i < n+1; i++){
            z+=i;
        }
        return z;
    }

    public int multiplicationInteger(int n){
        int z = 1;
        for(int i = 1; i < n+1; i++){
            z*=i;
        }
        return z;
    }

    public int fibonacciNth(int n){
        int f0 = 0;
        int f1 = 1;
        int fn = 0;
        if (n == f0){
            return 0;
        } else if (n == f1){
            return 1;
        } else {
            for(int i = 0; i < n -1 ; i++){
               fn = f0 + f1;
               f0 = f1;
               f1 = fn;
            }
            return fn;
        }
    }

    public void reverseString(String str){
        if ((str==null)||(str.length() <= 1)){
           System.out.println(str);
        } else {
            for(int i = str.length()-1; i >= 0; i--){
                System.out.print(str.charAt(i));
            }
            System.out.println();
        }
    }

    public boolean charExists(String str, char ch){
        if (str.isEmpty()){
            return false;
        }
        if (str.charAt(0) == ch) {
            return true;
        } else {
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == ch){
                return true;
                }
            }
            return false;
        }
    }

    public static int gcd(int n, int m) {
        while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return n;
    }

    public static int uniquePaths(int n, int m) {
        // Edge cases
        if (n == 0 || m == 0) {
            return 0;
        }
        if (n == 1 || m == 1) {
            return 1;
        }

        // DP array to store the number of ways to reach each cell
        int[][] dp = new int[n][m];

        // Initialize the first row and first column to 1 (only one way to reach cells in the first row or column)
        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < m; j++) {
            dp[0][j] = 1;
        }

        // Fill the DP table
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        // The bottom-right corner will have the total number of unique paths
        return dp[n - 1][m - 1];
    }
}

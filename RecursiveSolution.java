public class RecursiveSolution {
    public RecursiveSolution(){
    }

    public int sumInteger(int n){
        if (n <= 1){
            return n;
        } else {
            return n + sumInteger(n-1);
        }
    }

    public int multiplicationInteger(int n){
        if (n <= 1){
            return n;
        } else {
            return n * multiplicationInteger(n-1);
        }
    }

    public int fibonacciNth(int n){
        if (n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        } else {
            return fibonacciNth(n-1) + fibonacciNth(n-2);
        }
    }

    public void reverseString(String str)
    {
        if ((str==null)||(str.length() <= 1))
           System.out.println(str);
        else
        {
            System.out.print(str.charAt(str.length()-1));
            reverseString(str.substring(0,str.length()-1));
        }
    }

    public boolean charExists(String str, char ch) {
        if (str.isEmpty()) {
            return false;
        }
        if (str.charAt(0) == ch) {
            return true;
        }
        return charExists(str.substring(1), ch);
    }

    public int uniquePaths(int n, int m) {
        // Base case: If either row or column is 1, there is only one path
        if (n == 1 || m == 1) {
            return 1;
        }

        // Recursive case: Sum of paths by moving right and moving down
        return uniquePaths(n - 1, m) + uniquePaths(n, m - 1);
    }
}

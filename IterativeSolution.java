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
        for(int i = 1; i < str.length()-1; i++){
            if(str.charAt(i) == ch){
                return true;
                }
            }
            return false;
        }
    }
}

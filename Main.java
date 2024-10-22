public class Main {
    public static void main(String[] args){
        RecursiveSolution rSolution = new RecursiveSolution();
        System.out.println("Hello World");
        System.out.println(rSolution.sumInteger(5));
        System.out.println(rSolution.multiplicationInteger(5));
        System.out.println(rSolution.fibonacciNth(13));
        rSolution.reverseString("null");

        System.out.println(rSolution.charExists("null", 'u'));
        int n = 3, m = 3;
        int result = rSolution.uniquePaths(n, m);
        System.out.println("Number of unique paths: " + result);


        System.out.println();

        IterativeSolution is = new IterativeSolution();
        System.out.println(is.sumInteger(5));
        System.out.println(is.multiplicationInteger(5));
        System.out.println(is.fibonacciNth(13));
        is.reverseString("null");
        System.out.println(rSolution.charExists("nuld", 'd'));

    }
}

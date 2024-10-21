public class Main {
    public static void main(String[] args){
        RecursiveSolution rSolution = new RecursiveSolution();
        System.out.println("Hello World");
        System.out.println(rSolution.sumInteger(5));
        System.out.println(rSolution.multiplicationInteger(5));
        System.out.println(rSolution.fibonacciNth(13));
        rSolution.reverseString("null");

        System.out.println(rSolution.charExists("null", '1'));
    }
}
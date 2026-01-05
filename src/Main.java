import stack.dailytemperatures.Solution;


public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var values = new int[] {30,38,30,36,35,40,28};
        var temperatures = solution.dailyTemperatures(values);
        for (int temperature : temperatures) {
            System.out.println(temperature);
        }
    }
}
public class TestMath {
    public static void main(String[] args) {
        double result1 = Math.exp(1);
        double result2 = StrictMath.exp(1);
        double result3 = Math.log(3.0);
        double result4 = StrictMath.log(3.0);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(System.getProperty("os.arch"));
    }
}

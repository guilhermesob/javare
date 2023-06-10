public class Main {
    public static void main(String[] args) {
        // Conditional Statements
        int firstValue = 30;
        int secondValue = 27;

//        if (firstValue < secondValue) {
//            System.out.println("The second value is the biggest");
//        } else if (firstValue > secondValue) {
//            System.out.println("The first value is greater than the second value");
//        } else {
//            System.out.println("The first value equals the second value");
//        }
        // Short if
        String testingResult = (firstValue > secondValue) ? "Second Value is the biggest" : "First Value is the biggest";
        System.out.println(testingResult);

    }
}

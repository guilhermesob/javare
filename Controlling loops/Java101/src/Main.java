public class Main {
    public static void main(String[] args) {
        for (int valueEntered = 0; valueEntered <= 18; valueEntered += 2) {
            if (valueEntered == 10) {
                continue;
            }
            System.out.println(valueEntered);
        }
    }
}

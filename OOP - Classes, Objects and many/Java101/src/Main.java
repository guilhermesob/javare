public class Main {
    int valueEntered = 10;
    String newText = "Java is Powerful";

    public static void main(String[] args) {
        Main newObj1 = new Main();
        Main newObj2 = new Main();

        newObj1.valueEntered = 20;
        newObj1.newText = "A new skill!";

        System.out.println(newObj1.valueEntered);
        System.out.println(newObj2.valueEntered);
        System.out.println(newObj1.newText);
        System.out.println(newObj2.newText);
    }
}

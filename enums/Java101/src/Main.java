// Months Enumeration
enum Month {
    January,
    February,
    March,
    April
}

public class Main {
    public static void main(String[] args) {
        Month newVar = Month.February;
//        System.out.println(newVar);
        switch (newVar) {
            case January:
                System.out.println("This is January");
                break;
            case February:
                System.out.println("This is February");
                break;
            case March:
                System.out.println("This is March");
                break;
            case April:
                System.out.println("This is April");
                break;
        }
    }
}
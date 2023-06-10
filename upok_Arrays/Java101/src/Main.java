public class Main {
    public static void main(String[] args) {
//        String[] players = {"Ronaldo", "Messi", "Salah"};
//        int[] numbers = {7, 30, 11};

        // Accessing Array values
//        System.out.println(players[0]);
//        System.out.println(players[1]);
//        System.out.println(players[2]);
        // Change Value
        // players[0] = "Son";
//        System.out.println(players[0]);

        // Number of items
//        System.out.println(players.length);
//        String[] players = {"Ronaldo", "Messi", "Salah"};

//        for (int player = 0; player < players.length; player++) {
//            System.out.println(players[player]);
//        }

//        for (String player : players) {
//            System.out.println(player);
//        }

        // Multidimensional array
        int[][] newNumbers = {{10, 20, 30}, {40, 50, 60}};
        int targetedValue = newNumbers[0][1];

        System.out.println(targetedValue);
    }
}

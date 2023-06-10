public class Main {
    int playerNum;
    String playerName;

    public Main(int number, String name) {
        playerNum = number;
        playerName = name;
    }

    public static void main(String[] args) {
        Main newPlayer = new Main(30, "Messi");
        System.out.println(newPlayer.playerNum + " " + newPlayer.playerName);
    }
}

// Player class(Parent class)
class Player {
    protected String name = "Player-Parent";
    public void newMessage(){
        System.out.println("This is the Player-Parent message!");
    }
}

class NewPlayer extends Player {
    public String newItemName = "NewPlayer-P01";

    public static void main(String[] args) {
        NewPlayer newSkilledPlayer = new NewPlayer();
        newSkilledPlayer.newMessage();
        System.out.println(newSkilledPlayer.name + " " + newSkilledPlayer.newItemName);
    }
}

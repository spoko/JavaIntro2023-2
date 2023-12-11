package homeworks.hw7;

public class Test {

    public static void main(String[] args) {
        Team barcelona = new Team("Barcelona");

        PlayerStats messiStats = new PlayerStats(75,85,84,
                92,67);
        Player messi = new Player("Messi", messiStats);

        PlayerStats piqueStats = new PlayerStats(95,82,82,
                89,68);
        Player pique = new Player("Pique", piqueStats);

        System.out.printf("Rating initially is: %d\n", barcelona.getRating());

        barcelona.addPlayerToTheTeam(messi);
        System.out.printf("Rating after adding a player is: %d\n", barcelona.getRating());

        barcelona.addPlayerToTheTeam(pique);
        System.out.printf("Rating after adding a player is: %d\n", barcelona.getRating());

        barcelona.removePlayerFromTheTeam(pique);
        System.out.printf("Rating after removing a player is: %d\n", barcelona.getRating());
    }
}

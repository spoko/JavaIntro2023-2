package homeworks.hw7;

import java.util.LinkedList;

public class Team {
    private String name;
    private int rating;
    public LinkedList<Player> playerList = new LinkedList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            //Todo add exception
        }
    }

    public int getRating() {
        return rating;
    }

    public Team(String name){
        setName(name);
    }

    public void addPlayerToTheTeam(Player playerToBeAdded){
        playerList.add(playerToBeAdded);
        calculateRating();
    }

    public void removePlayerFromTheTeam(Player playerToBeRemoved){
        if (playerList.contains(playerToBeRemoved)){
            playerList.remove(playerToBeRemoved);
            calculateRating();
        }else {
            //Todo add exception
        }
    }

    private void calculateRating(){
        int temp = 0;

        for (Player player : playerList){
            temp += player.getOverallSkill();
        }
        rating = temp / playerList.size();
    }
}

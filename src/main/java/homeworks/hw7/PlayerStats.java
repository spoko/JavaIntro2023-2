package homeworks.hw7;

public class PlayerStats {
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    private int getEndurance() {
        return endurance;
    }

    private void setEndurance(int endurance) {
        if (endurance >=0 && endurance <= 100){
            this.endurance = endurance;
        }else {
            throw new ExceptionInInitializerError("Value must be between 0 and 100.");
        }
    }

    private int getSprint() {
        return sprint;
    }

    private void setSprint(int sprint) {
        if (sprint >=0 && sprint <= 100){
            this.sprint = sprint;
        }else {
            throw new ExceptionInInitializerError("Value must be between 0 and 100.");
        }
    }

    private int getDribble() {
        return dribble;
    }

    private void setDribble(int dribble) {
        if (dribble >=0 && dribble <= 100){
            this.dribble = dribble;
        }else {
            throw new ExceptionInInitializerError("Value must be between 0 and 100.");
        }
    }

    private int getPassing() {
        return passing;
    }

    private void setPassing(int passing) {
        if (passing >=0 && passing <= 100){
            this.passing = passing;
        }else {
            throw new ExceptionInInitializerError("Value must be between 0 and 100.");
        }
    }

    private int getShooting() {
        return shooting;
    }

    private void setShooting(int shooting) {
        if (shooting >=0 && shooting <= 100){
            this.shooting = shooting;
        }else {
            throw new ExceptionInInitializerError("Value must be between 0 and 100.");
        }
    }

    public PlayerStats(int endurance, int sprint, int dribble, int passing, int shooting){
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    public int getStats(){
        return (endurance + sprint + dribble + passing + shooting) / 5;
    }
}

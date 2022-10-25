package thrones.game.players;

public class Team {
    private int teamNum;
    private int teamScore;

    public int teamSize;

    private Player[] players;

    public Team( int number) {
        this.teamNum = number;
        this.teamScore = 0;
    }

    public int getTeamNum() {
        return teamNum;
    }

    public int getTeamScore() {
        return teamScore;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamNum=" + teamNum +
                ", teamScore=" + teamScore +
                '}';
    }
}

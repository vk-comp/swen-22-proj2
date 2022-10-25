package thrones.game.players;

import ch.aplu.jcardgame.Hand;

public abstract class  Player {
    private String type;
    private int team;
    private int score;

    public int getPlayerNum() {
        return playerNum;
    }

    public void setPlayerNum(int playerNum) {
        this.playerNum = playerNum;
    }

    private int playerNum;

    public Hand hand;

    public Hand getHand() {
        return hand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Player (String type, int score, int playerNum) {
        this.type = type;
        if (playerNum % 2 == 0) {
            this.team = 0;
        } else {
            this.team = 1;
        }
        this.score = score;
        this.playerNum = playerNum;
    }
}

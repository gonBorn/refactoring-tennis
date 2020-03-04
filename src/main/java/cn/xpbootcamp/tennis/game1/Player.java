package cn.xpbootcamp.tennis.game1;


public class Player {
    private String playerName;
    private int mScore;

    public Player(String playerName, int mScore) {
        this.playerName = playerName;
        this.mScore = mScore;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getScore() {
        return mScore;
    }

    public void plusPoint4Player() {
        mScore++;
    }
}

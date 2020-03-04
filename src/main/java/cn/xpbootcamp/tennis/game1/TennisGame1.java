package cn.xpbootcamp.tennis.game1;

import cn.xpbootcamp.tennis.TennisGame;

public class TennisGame1 implements TennisGame {
    private Player player1;
    private Player player2;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name, 0);
        this.player2 = new Player(player2Name, 0);
    }

    @Override
    public void wonPoint(String playerName) {
        getWinner(playerName).plusPoint4Player();
    }

    private Player getWinner(String playerName) {
        return playerName.equals(player1.getPlayerName()) ? player1 : player2;
    }

    @Override
    public String getScore() {
        int mScore1 = player1.getScore();
        int mScore2 = player2.getScore();
        String score = "";
        int tempScore = 0;
        if (mScore1 == mScore2) {
            score = Score.create(mScore1).getDeuce();
        } else if (mScore1 >= 4 || mScore2 >= 4) {
            int minusResult = mScore1 - mScore2;
            if (minusResult == 1) {
                score = "Advantage player1";
            } else if (minusResult == -1) {
                score = "Advantage player2";
            } else if (minusResult >= 2) {
                score = "Win for player1";
            } else {
                score = "Win for player2";
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = mScore1;
                } else {
                    score += "-";
                    tempScore = mScore2;
                }
                score += Score.create(tempScore).getScore();
            }
        }
        return score;
    }
}
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

    @Override
    public String getScore() {
        if (isDeduce()) {
            return Score.create(player1.getScore()).getDeuce();
        }
        if (isBothScoreBeyond4()) {
            return getMinusResult();
        }

        return getRegularResult();
    }

    private Player getWinner(String playerName) {
        return playerName.equals(player1.getPlayerName()) ? player1 : player2;
    }

    private boolean isBothScoreBeyond4() {
        return player1.getScore() >= 4 || player2.getScore() >= 4;
    }

    private boolean isDeduce() {
        return player1.getScore() == player2.getScore();
    }

    private String getRegularResult() {
        int tempScore;
        String score = "";
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = player1.getScore();
            } else {
                score += "-";
                tempScore = player2.getScore();
            }
            score += Score.create(tempScore).getScore();
        }
        return score;
    }

    private String getMinusResult() {
        return (Math.abs(player1.getScore() - player2.getScore()) == 1) ?
          ((player1.getScore() > player2.getScore()) ? "Advantage player1" : "Advantage player2") :
          ((player1.getScore() > player2.getScore()) ? "Win for player1" : "Win for player2");
    }
}
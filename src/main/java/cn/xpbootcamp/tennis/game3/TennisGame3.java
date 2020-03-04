package cn.xpbootcamp.tennis.game3;

import cn.xpbootcamp.tennis.TennisGame;

public class TennisGame3 implements TennisGame {
    private int ponit1;
    private int point2;
    private String playerName1;
    private String playerName2;

    public TennisGame3(String playerName1, String playerName2) {
        this.playerName1 = playerName1;
        this.playerName2 = playerName2;
    }

    @Override
    public String getScore() {
        if (isRegularScore()) {
            String[] pointType = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            return (isDeuce()) ? pointType[ponit1] + "-All" : pointType[ponit1] + "-" + pointType[point2];
        } else {
            return isDeuce() ? "Deuce" : getAdvantageOrWin();
        }
    }

    private boolean isRegularScore() {
        return ponit1 < 4 && point2 < 4 && ponit1+point2 != 6;
    }

    private boolean isDeuce() {
        return ponit1 == point2;
    }

    private String getAdvantageOrWin() {
        String score = ponit1 > point2 ? playerName1 : playerName2;
        return ((ponit1 - point2) * (ponit1 - point2) == 1) ? "Advantage " + score : "Win for " + score;
    }

    @Override
    public void wonPoint(String playerName) {
        if (playerName.equals(this.playerName1)) {
            this.ponit1 += 1;
        } else {
            this.point2 += 1;
        }

    }

}
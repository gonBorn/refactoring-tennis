package cn.xpbootcamp.tennis.game1.Scores;

import cn.xpbootcamp.tennis.game1.Score;

public class Forty extends Score {

    @Override
    public String getScore() {
        return "Forty";
    }

    @Override
    public String getDeuce() {
        return "Deuce";
    }
}

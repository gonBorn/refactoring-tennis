package cn.xpbootcamp.tennis.game1.Scores;

import cn.xpbootcamp.tennis.game1.Score;

public class Fifteen extends Score {

    @Override
    public String getScore() {
        return "Fifteen";
    }

    @Override
    public String getDeuce() {
        return "Fifteen-All";
    }
}

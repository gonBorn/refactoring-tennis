package cn.xpbootcamp.tennis.game1.Scores;

import cn.xpbootcamp.tennis.game1.Score;

public class Love extends Score {

    @Override
    public String getScore() {
        return "Love";
    }

    @Override
    public String getDeuce() {
        return "Love-All";
    }
}

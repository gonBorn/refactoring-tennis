package cn.xpbootcamp.tennis.game1;

import cn.xpbootcamp.tennis.game1.Scores.Fifteen;
import cn.xpbootcamp.tennis.game1.Scores.Forty;
import cn.xpbootcamp.tennis.game1.Scores.Love;
import cn.xpbootcamp.tennis.game1.Scores.Thirty;

public class Score {
    private static final int LOVE = 0;
    private static final int FIFTEEN = 1;
    private static final int THIRTY = 2;

    public static Score create(int type) {
        switch (type) {
            case LOVE:
                return new Love();
            case FIFTEEN:
                return new Fifteen();
            case THIRTY:
                return new Thirty();
            default:
                return new Forty();
        }
    }

    public Score() {
    }

    public String getScore() {
        return "";
    }

    public String getDeuce() {
        return "";
    }
}

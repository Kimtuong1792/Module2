package ss8.bai_tap;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int m_score1, int m_score2) {
        final int ZERO = 0;
        final int ONE = 1;
        final int TWO = 2;
        final int THREE = 3;
        String score = "";
        int tempScore = 0;
        if (m_score1 == m_score2) {
            switch (m_score1) {
                case ZERO:
                    score = "Love-All";
                    break;
                case ONE:
                    score = "Fifteen-All";
                    break;
                case TWO:
                    score = "Thirty-All";
                    break;
                case THREE:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (m_score1 >= 4 || m_score2 >= 4) {
            score = check(m_score1, m_score2);
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = m_score1;
                } else {
                    score += "-";
                    tempScore = m_score2;
                }
                switch (tempScore) {
                    case ZERO:
                        score += "Love";
                        break;
                    case ONE:
                        score += "Fifteen";
                        break;
                    case TWO:
                        score += "Thirty";
                        break;
                    case THREE:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }

    private static String check(int m_score1, int m_score2) {
        String score;
        int minusResult = m_score1 - m_score2;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }
}

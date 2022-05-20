package ss8.bai_tap;

public class TennisGame {
    public static String getScore(int player1Score, int player2Score) {
        final int ZERO = 0;
        final int ONE = 1;
        final int TWO = 2;
        final int THREE = 3;
        StringBuilder score = new StringBuilder();
        int tempScore;
        if (player1Score == player2Score) {
            switch (player1Score) {
                case ZERO:
                    score = new StringBuilder("Love-All");
                    break;
                case ONE:
                    score = new StringBuilder("Fifteen-All");

                    break;
                case TWO:
                    score = new StringBuilder("Thirty-All");
                    break;
                case THREE:
                    score = new StringBuilder("Forty-All");
                    break;
                default:
                    score = new StringBuilder("Deuce");
                    break;

            }
        } else if (player1Score >= 4 || player2Score >= 4)
            score = new StringBuilder(check(player1Score, player2Score));
        else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = player1Score;
                } else {
                    score.append("-");
                    tempScore = player2Score;
                }
                switch (tempScore) {
                    case ZERO:
                        score.append("Love");
                        break;
                    case ONE:
                        score.append("Fifteen");
                        break;
                    case TWO:
                        score.append("Thirty");
                        break;
                    case THREE:
                        score.append("Forty");
                        break;
                }
            }
        }
        return score.toString();
    }

    private static String check(int player1Score, int player2Score) {
        String score;
        int minusResult = player1Score - player2Score;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }
}

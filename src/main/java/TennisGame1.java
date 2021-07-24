import java.util.Objects;

public class TennisGame1 {
    private int m_score1 = 0;
    private int m_score2 = 0;
    private final String player1Name;
    private final String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (Objects.equals(playerName, this.player1Name)) {
            m_score1++;
        } else {
            m_score2++;
        }
    }

    private boolean isDeuce() {
        return m_score1 == m_score2 && m_score1 > 2;
    }

    private boolean isAll() {
        return m_score1 == m_score2 && m_score1 <= 2;
    }

    public String NotEqualScoreForPlayer (int diffScore, String playerName)
    {
        if (diffScore < 2)
        {
            return "Advantage " + playerName;
        }
        else
        {
            return "Win for " + playerName;
        }
    }

    public String getScore() {
        String[] scoreResults = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
        if (isAll()) {
            return scoreResults[m_score1] + "-" + "All";
        }

        if (isDeuce()) {
            return "Deuce";
        }

        if (m_score1 >= 4 || m_score2 >= 4) {
            int diffScore = m_score1 - m_score2; // if + means 1st > 2nd , - means 1st < 2nd
            if (diffScore >= 0) // input player 1
            {
                return NotEqualScoreForPlayer(diffScore, player1Name);
            }
            else // input player 2
            {
                return NotEqualScoreForPlayer(diffScore * -1, player2Name);
            }
        }


        return scoreResults[m_score1] + "-" + scoreResults[m_score2];
    }
}
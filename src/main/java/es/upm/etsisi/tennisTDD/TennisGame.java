package es.upm.etsisi.tennisTDD;

import java.util.Map;

public class TennisGame {

    int playerOneScore;
    int playerTwoScore;
    Map<Integer, String> scoring = Map.of(0, "Love", 1, "Fifteen", 2, "Thirty", 3, "Forty");

    public String getScore() {
        String p1Score = scoring.get(playerOneScore);
        String p2Score = scoring.get(playerTwoScore);

        if (playerOneScore == 0 && playerTwoScore == 0){
            return "Love-Love";
        }
        if (isAll()) {
            return scoring.get(playerOneScore) + "-All";
        }

            //victoria
        if (playerOneScore >= 4 && playerOneScore >= playerTwoScore + 2) {
            return "Player One Wins";
        }
        if (playerTwoScore >= 4 && playerTwoScore >= playerOneScore + 2) {
            return "Player Two Wins";
        }

        //iguales o ventaja
        if (playerOneScore >= 3 && playerTwoScore >= 3) {
            if (playerOneScore == playerTwoScore) {
                return "Deuce";
            } else if (playerOneScore == playerTwoScore + 1) {
                return "Advantage Player One";
            } else if (playerTwoScore == playerOneScore + 1) {
                return "Advantage Player Two";
            } else if (playerOneScore >= playerTwoScore + 2) {
                return "Player One Wins";
            } else if (playerTwoScore >= playerOneScore + 2) {
                return "Player Two Wins";
            }
        }

        return p1Score + "-" + p2Score;
    }

    public boolean isAll(){
        return playerOneScore == playerTwoScore && playerOneScore < 3;
    }

    public void playerOneScores(){
        playerOneScore++;
    }
    public void playerTwoScores(){
        playerTwoScore++;
    }

}

package es.upm.etsisi.poo24_25;


import es.upm.etsisi.tennisTDD.TennisGame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class TennisTest {

    TennisGame tennisGame;
    @BeforeEach
    public void setUp() {
        tennisGame = new TennisGame();
    }

    @Test
    void shouldReturnLoveLove(){
        String score = tennisGame.getScore();
        assertEquals("Love-Love", score);
    }
    @Test
    void shouldReturnFifteenLoveOnPlayerOneScore(){
        tennisGame.playerOneScores();
        String score = tennisGame.getScore();
        assertEquals("Fifteen-Love", score);
    }
    @Test
    void shouldReturnThirtyLoveOnPlayerOneScore(){
        tennisGame.playerOneScores();
        tennisGame.playerOneScores();
        String score = tennisGame.getScore();
        assertEquals("Thirty-Love", score);
    }
    @Test
    void shouldReturnFortyLoveOnPlayerOneScore(){
        tennisGame.playerOneScores();
        tennisGame.playerOneScores();
        tennisGame.playerOneScores();
        String score = tennisGame.getScore();
        assertEquals("Forty-Love", score);
    }
    @Test
    void shouldReturnLoveFifteenOnPlayerTwoScore(){
        tennisGame.playerTwoScores();
        String score = tennisGame.getScore();
        assertEquals("Love-Fifteen", score);
    }
    @Test
    void shouldReturnLoveThirtyOnPlayerTwoScore(){
        tennisGame.playerTwoScores();
        tennisGame.playerTwoScores();
        String score = tennisGame.getScore();
        assertEquals("Love-Thirty", score);
    }
    @Test
    void shouldReturnLoveFortyOnPlayerTwoScore(){
        tennisGame.playerTwoScores();
        tennisGame.playerTwoScores();
        tennisGame.playerTwoScores();
        String score = tennisGame.getScore();
        assertEquals("Love-Forty", score);
    }
    @Test
    void shouldReturnFifteenThirty(){
        tennisGame.playerOneScores();
        tennisGame.playerTwoScores();
        tennisGame.playerTwoScores();
        String score = tennisGame.getScore();
        assertEquals("Fifteen-Thirty", score);
    }
    @Test
    void shouldReturnThirtyFifteen(){
        tennisGame.playerOneScores();
        tennisGame.playerOneScores();
        tennisGame.playerTwoScores();
        String score = tennisGame.getScore();
        assertEquals("Thirty-Fifteen", score);
    }
    @Test
    void shouldReturnFifteenAll(){
        tennisGame.playerOneScores();
        tennisGame.playerTwoScores();
        String score = tennisGame.getScore();
        assertEquals("Fifteen-All", score);
    }

    @Test
    void shouldReturnThirtyAll(){
        tennisGame.playerOneScores();
        tennisGame.playerOneScores();
        tennisGame.playerTwoScores();
        tennisGame.playerTwoScores();
        String score = tennisGame.getScore();
        assertEquals("Thirty-All", score);
    }

    @Test
    void shouldReturnDeuce(){
        tennisGame.playerOneScores();
        tennisGame.playerOneScores();
        tennisGame.playerOneScores();
        tennisGame.playerTwoScores();
        tennisGame.playerTwoScores();
        tennisGame.playerTwoScores();
        String score = tennisGame.getScore();
        assertEquals("Deuce", score);
    }
    //ventajas
    @Test
    void shouldReturnAdvantagePlayerOne(){
        tennisGame.playerOneScores();
        tennisGame.playerOneScores();
        tennisGame.playerOneScores();
        tennisGame.playerTwoScores();
        tennisGame.playerTwoScores();
        tennisGame.playerTwoScores();

        tennisGame.playerOneScores();
        String score = tennisGame.getScore();
        assertEquals("Advantage Player One", score);
    }
    @Test
    void shouldReturnAdvantagePlayerTwo(){
        tennisGame.playerOneScores();
        tennisGame.playerOneScores();
        tennisGame.playerOneScores();
        tennisGame.playerTwoScores();
        tennisGame.playerTwoScores();
        tennisGame.playerTwoScores();

        tennisGame.playerTwoScores();
        String score = tennisGame.getScore();
        assertEquals("Advantage Player Two", score);
    }


    //ganar
    @Test
    void shouldBeWinPlayerOne(){
        tennisGame.playerOneScores();
        tennisGame.playerOneScores();
        tennisGame.playerOneScores();
        tennisGame.playerTwoScores();
        tennisGame.playerTwoScores();
        tennisGame.playerTwoScores();

        tennisGame.playerOneScores();
        tennisGame.playerOneScores();
        String score = tennisGame.getScore();
        assertEquals("Player One Wins", score);
    }

    @Test
    void shouldBeWinPlayerTwo(){
        tennisGame.playerOneScores();
        tennisGame.playerOneScores();
        tennisGame.playerOneScores();
        tennisGame.playerTwoScores();
        tennisGame.playerTwoScores();
        tennisGame.playerTwoScores();

        tennisGame.playerTwoScores();
        tennisGame.playerTwoScores();
        String score = tennisGame.getScore();
        assertEquals("Player Two Wins", score);
    }

    @Test
    void shouldBeCleanWinPlayerOne(){
        tennisGame.playerOneScores();
        tennisGame.playerOneScores();
        tennisGame.playerOneScores();
        tennisGame.playerOneScores();
        tennisGame.playerTwoScores();

        String score = tennisGame.getScore();
        assertEquals("Player One Wins", score);
    }

    @Test
    void shouldBeCleanWinPlayerTwo(){
        tennisGame.playerTwoScores();
        tennisGame.playerTwoScores();
        tennisGame.playerTwoScores();
        tennisGame.playerTwoScores();

        String score = tennisGame.getScore();
        assertEquals("Player Two Wins", score);
    }
}

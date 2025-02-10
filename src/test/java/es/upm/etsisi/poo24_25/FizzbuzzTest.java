package es.upm.etsisi.poo24_25;


import es.upm.etsisi.tennisTDD.FizzbuzzGame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzTest {

    @Test
    void returnFizzBuzzMultipleOf3() {
        FizzbuzzGame app = new FizzbuzzGame();
        String result = app.execute(3);
        assertEquals("Fizz", result);
    }

    @Test
    void returnFizzBuzzMultipleOf5() {
        FizzbuzzGame app = new FizzbuzzGame();
        String result = app.execute(5);
        assertEquals("Buzz", result);
    }
    @Test
    void returnFizzBuzzMultipleOf3And5() {
        FizzbuzzGame app = new FizzbuzzGame();
        String result = app.execute(15);
        assertEquals("Fizzbuzz", result);
    }
    @Test
    void returnFizzBuzzNothing() {
        FizzbuzzGame app = new FizzbuzzGame();
        String result = app.execute(16);
        assertEquals("", result);
    }

    @Test
    void shouldThrowExceptionIfNull(){
        FizzbuzzGame app = new FizzbuzzGame();
        assertThrows(NullPointerException.class, () -> app.execute(null));
    }

}

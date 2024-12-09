package java_collections.tests;

import java_collections.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameShopTest {

    private final List<Game> games = new GameDatabase().getGames();
    private final GameShop gameShop = new GameShop(games);

    @Test
    public void testListOfDistinctDevelopers() {

        List<Developer> actual = gameShop.listOfDistinctDevelopers();

        assertEquals(57, actual.size());
        assertEquals(new HashSet<>(actual).size(), actual.size());

    }


    @Test
    public void testDeveloperWithMostGame() {
        Developer actual = gameShop.developerWithMostGame();
        Developer expected = new Developer("Dark Water Studios Ltd");

        assertEquals(expected, actual);
    }


    @Test
    public void getMedianPriceTest(){
        double expected = 7.0;
        double actual = gameShop.medianPriceOfGames();
        assertEquals(expected, actual);
    }

    @Test
    public void getMinPriceTest(){
        Game expected = new Game("Two Weeks in Painland", 0.0,50,8, new Developer("Unusual Games"), new ArrayList<>(List.of(Genre.ADVENTURE, Genre.INDIE)));
        Game actual = gameShop.minPriceGame();
        assertEquals(expected,actual);
    }


}

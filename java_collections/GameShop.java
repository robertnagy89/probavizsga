package java_collections;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GameShop {

    private final List<Game> games;

    public GameShop(List<Game> games) {
        this.games = games;
    }

    public List<Developer> listOfDistinctDevelopers() {

        return games.stream().map(Game::getDeveloper).distinct().toList();

    }

    public Developer developerWithMostGame() {
        return games.stream()
                .collect(Collectors.groupingBy(Game::getDeveloper))
                .entrySet().stream()
                .max(Comparator.comparingInt(o -> o.getValue().size()))
                .orElseThrow()
                .getKey();
    }

    public Map<Developer, List<Game>> gamesByDeveloper() {
        return games.stream()
                .collect(Collectors.groupingBy(Game::getDeveloper));
    }

    public double medianPriceOfGames() {
        int sumPrice = 0;
        for(Game game:games){
            sumPrice += game.getPrice();
        }
        return sumPrice/games.size();
    }

    public Game minPriceGame() {
        double minPrice = Integer.MAX_VALUE;
        Game minPriceGame = null;
        for(Game game: games){
            if(game.getPrice()<minPrice){
                minPriceGame = game;
                minPrice = game.getPrice();
            }
        }
        return minPriceGame;
    }


}

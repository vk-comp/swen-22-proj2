package thrones.game.factory;

import thrones.game.players.*;

public class PlayerFactory {

    private static PlayerFactory instance;

    public static PlayerFactory getInstance() {

        if (instance == null) {

            synchronized (PlayerFactory.class) {
                if (instance == null) {
                    instance = new PlayerFactory();
                }
            }
        }
        return instance;
    }

    public Player makePlayer(String type, int playerNumber) {
        switch (type) {
            case "H":
                return new HumanPlayer(playerNumber);
            case "S":
                return new SimplePlayer(playerNumber);
            case "SS":
                return new SmartPlayer(playerNumber);
            default:
                return new RandomPlayer(playerNumber);
        }
    }

}

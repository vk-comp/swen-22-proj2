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

    public Player makePlayer(String type) {
        switch (type) {
            case "human":
                return new HumanPlayer();
            case "simple":
                return new SimplePlayer();
            case "smart":
                return new SmartPlayer();
            default:
                return new RandomPlayer();
        }
    }

}

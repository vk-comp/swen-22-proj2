package thrones.game.players;

import ch.aplu.jcardgame.Card;
import thrones.game.GoTCardRules.Suit;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

public class SimplePlayer extends Player {
    public SimplePlayer() {

        super();
    }

    @Override
    public int selectRandomPile(Optional <Card> selected, int nextPlayer, ArrayList<Card> cards) {
        Suit s = (Suit) selected.get().getSuit();
        if (s.isAttack() || s.isDefence()){
            if (nextPlayer == 0 || nextPlayer == 2){
                return 0;
            }else{
                return 1;
            }
        }else {
            if (nextPlayer == 0 || nextPlayer == 2){
                return 1;
            }else{
                return 0;
            }
        }
    }
}

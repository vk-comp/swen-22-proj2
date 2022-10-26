package thrones.game.players;

import ch.aplu.jcardgame.Card;
import thrones.game.GoTCardRules.Rank;
import thrones.game.GoTCardRules.Suit;

import java.util.ArrayList;
import java.util.Optional;

public class SmartPlayer extends Player {
    public SmartPlayer() {

        super();
    }

    public int selectRandomPile(Optional<Card> selected, int nextPlayer, ArrayList<Card> cards) {
        Rank r = (Rank) selected.get().getRank();
        Suit s = (Suit) selected.get().getSuit();
        for (Card c:cards){
            if (((Rank) c.getRank()).getRankValue() == r.getRankValue()){
                return -1;
            }
        }
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

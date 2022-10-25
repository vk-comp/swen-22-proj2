package thrones.game;

import ch.aplu.jcardgame.Card;
import ch.aplu.jcardgame.Hand;
import thrones.game.GoTCardRules.*;


import java.util.stream.Collectors;

public class Canonical {
    public String canonical(Suit s) { return s.toString().substring(0, 1); }

    public String canonical(Rank r) {
        switch (r) {
            case ACE: case KING: case QUEEN: case JACK: case TEN:
                return r.toString().substring(0, 1);
            default:
                return String.valueOf(r.getRankValue());
        }
    }

    public String canonical(Card c) { return canonical((Rank) c.getRank()) + canonical((Suit) c.getSuit()); }

    public String canonical(Hand h) {
        return "[" + h.getCardList().stream().map(this::canonical).collect(Collectors.joining(",")) + "]";
    }
}

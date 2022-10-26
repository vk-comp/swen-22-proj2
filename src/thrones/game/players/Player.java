package thrones.game.players;

import ch.aplu.jcardgame.Card;
import ch.aplu.jcardgame.Hand;
import thrones.game.GoTCardRules.Suit;

import java.util.*;
import java.util.random.RandomGenerator;

public abstract class  Player {

    public Player () {

    }

    public Optional<Card> selectedCard(int playerIndex, boolean isCharacter, Hand[] hands){
        Optional<Card> selected;
        Hand currentHand = hands[playerIndex];
        List<Card> shortListCards = new ArrayList<>();
        for (int i = 0; i < currentHand.getCardList().size(); i++) {
            Card card = currentHand.getCardList().get(i);
            Suit suit = (Suit) card.getSuit();
            if (suit.isCharacter() == isCharacter) {
                shortListCards.add(card);
            }
        }
        Random random = new Random();
        if (shortListCards.isEmpty() || !isCharacter && random.nextInt(3) == 0) {
            selected = Optional.empty();
        } else {
            selected = Optional.of(shortListCards.get(random.nextInt(shortListCards.size())));
        }
        return selected;
    }

    public int selectRandomPile(Optional<Card> selected, int nextPlayer, ArrayList<Card> cards) {
        Random random = new Random();
        return random.nextInt(2);
    }
}

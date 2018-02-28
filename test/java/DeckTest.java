import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card;
//    private ArrayList<Deck> deckOfCards;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void deckArrayStartsEmpty(){
        assertEquals(0, deck.getNumberOfCardsInDeck());
    }

    @Test
    public void addSingleCardToArray(){
        deck.addCardToArray(card);
        assertEquals(1, deck.getNumberOfCardsInDeck());
    }

    @Test
    public void populateArrayWithFullDeck(){
        deck.populateArrayWithFullDeck(card);
        assertEquals(52, deck.getNumberOfCardsInDeck());
    }
}

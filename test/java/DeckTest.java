import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DeckTest {

    Deck deck;
    Card card;
    Hand hand;
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
        deck.populateArrayWithFullDeck();
        assertEquals(52, deck.getNumberOfCardsInDeck());
    }

//    @Test
//    public void dealCard(){
//        deck.populateArrayWithFullDeck();
////        ArrayList<String> allCards = deck.getDeckOfCards();
////        String randomCard = deck.deal();
////        assertTrue(allCards.contains(randomCard));
////        deck.deal();
//        assertEquals("SIX of SPADES",deck.deal(44));
//    }

    @Test
    public void dealCardAndremoveDealtCardFromArray(){
        deck.populateArrayWithFullDeck();
        deck.deal(44);
        assertEquals(51,deck.getNumberOfCardsInDeck());
//        assertEquals(1, hand.getNumberOfCardsInHand());
    }
}

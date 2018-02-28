import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HandTest {

    Deck deck;
    Card card;
    Hand hand;

    @Before
    public void before() {
        hand = new Hand();
    }

    @Test
    public void handArrayStartsEmpty(){
        assertEquals(0, hand.getNumberOfCardsInHand());
    }

    @Test
    public void addSingleCardToHand(){
        hand.addCardToHand(card);
        assertEquals(1, hand.getNumberOfCardsInHand());
    }

//    @Test
//    public void countTotalValueOfCards(){
//        assertEquals(6, hand.getHandTotal());
//    }

}

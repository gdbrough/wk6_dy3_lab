import org.junit.Before;
import org.junit.Test;
import sun.rmi.rmic.iiop.ValueType;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, CardType.EIGHT);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetCardValue(){
        assertEquals(CardType.EIGHT, card.getCardValue());
    }

    @Test
    public void canGetAllSuits(){
        SuitType[] expected = {SuitType.HEARTS, SuitType.DIAMONDS, SuitType.CLUBS, SuitType.SPADES};
        SuitType[] suits = SuitType.values();
        assertEquals(4, suits.length);
        assertArrayEquals(expected, suits);
    }

    @Test
    public void canGetAllCards(){
        CardType[] expected = {CardType.ACE, CardType.TWO, CardType.THREE, CardType.FOUR, CardType.FIVE, CardType.SIX, CardType.SEVEN, CardType.EIGHT, CardType.NINE, CardType.TEN, CardType.JACK, CardType.QUEEN, CardType.KING};
        CardType[] cards = CardType.values();
        assertEquals(13, cards.length);
        assertArrayEquals(expected, cards);
    }

    @Test
    public void queenHasValue10(){
        card = new Card(SuitType.HEARTS, CardType.QUEEN);
        assertEquals(10, card.getValueFromEnum());
    }

}

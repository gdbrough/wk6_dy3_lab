import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deckOfCards;

    public Deck(){
        this.deckOfCards = new ArrayList<>();
    }

    public int getNumberOfCardsInDeck(){
        return this.deckOfCards.size();
    }

    public void addCardToArray(Card card){
        this.deckOfCards.add(card);
    }

    public void populateArrayWithFullDeck(){
        SuitType suits[] = SuitType.values();
        for (SuitType suit : suits) {
//            System.out.println(suit + " at index " + suit.ordinal());
//        }

            CardType cards[] = CardType.values();
            for (CardType cardName : cards) {
                System.out.println(cardName + " of " + suit);
//            }
//        SuitType[] suits = SuitType.;
//        System.out.println(suits);
                Card card = new Card(suit, cardName);
                addCardToArray(Card card);
//        for (suit in )
            }
        }
    }


}

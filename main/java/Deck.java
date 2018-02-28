import java.util.ArrayList;

public class Deck {

//    Card card;

    private ArrayList<Card> deckOfCards;
//    Card card = new Card();

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
        CardType cards[] = CardType.values();
        for (SuitType suit : suits) {
            for (CardType cardName : cards) {
                Card card = new Card(suit, cardName);
                addCardToArray(card);
            }
        }
    }

    public Card deal(){
        Card card = this.deckOfCards.get(44);
//        return card;
//        System.out.println(Card card.get(44));
        return card.getSuit();
    }


}

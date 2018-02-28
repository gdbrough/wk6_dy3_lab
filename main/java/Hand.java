import java.util.ArrayList;

public class Hand {

    Card card;
    Deck deck;

    private ArrayList<Card> handOfCards;

    public Hand(){
        this.handOfCards = new ArrayList<>();
    }

    public int getNumberOfCardsInHand(){
        return this.handOfCards.size();
    }

    public void addCardToHand(Card card){
        this.handOfCards.add(card);
    }

//    public int getHandTotal(){
//        CardType cards[] = this.handOfCards.;
//        for (CardType cardName : cards) {
//                Card card = new Card(suit, cardName);
//                addCardToArray(card);
//        }
//    }

}

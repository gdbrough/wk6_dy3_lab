import java.util.ArrayList;
import java.util.Random;

public class Deck {

//    Card card;
    Hand hand;

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

    public void removeCardFromArray(int index){
        this.deckOfCards.remove(index);
    }

    public ArrayList<Card> getDeckOfCards() {
        return new ArrayList<>(this.deckOfCards);
    }

//    public String deal(int cardNumber){
    public void deal(int cardNumber){
        if (cardNumber > 51) {
            Random rand = new Random();
            cardNumber = rand.nextInt(52);
        }
        Card card = this.deckOfCards.get(cardNumber);
        Hand hand = new Hand();
        removeCardFromArray(cardNumber);
        hand.addCardToHand(card);
        String result = card.getCardValue().toString() + " of " + card.getSuit().toString();
//        return result;
    }


}

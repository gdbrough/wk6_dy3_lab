public class Card {

    Card card;
    public SuitType suit;
    public CardType cardValue;

    public Card(SuitType suit, CardType cardValue){
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public SuitType getSuit() {
        return this.suit;
    }

    public CardType getCardValue() {
        return this.cardValue;
    }

    public int getValueFromEnum(){
        return this.cardValue.getValue();
    }

}

class Card {
    private CardRank rank;
    private CardSuit suit;

    public Card(CardRank rank, CardSuit suit) {
        this.rank = rank;
        this.suit = suit;
    }
    
    public int getCardVal() {
        return rank.getCardVal();
    }

    @Override
    public String toString() {
        return rank + " " + suit;
    }
}

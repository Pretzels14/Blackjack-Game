class Card {
    // Declare our objects of CardRank and CardSuit
    private CardRank rank;
    private CardSuit suit;

    /**
     * 
     * @param rank the rank of the card selected from the deck
     * @param suit the suit of the card selected from the deck
     */
    public Card(CardRank rank, CardSuit suit) {
        this.rank = rank;
        this.suit = suit;
    }
    
    // return the CardRank's value as an int
    public int getCardVal() {
        return rank.getValue();
    }

    // Convert our rank and suit into a string line
    @Override
    public String toString() {
        return rank + " " + suit;
    }
}

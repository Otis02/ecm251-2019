package utilities;

public class Card {
    private CardValues value;
    private CardNaipes naipes;

    public Card(CardNaipes naipes, CardValues value) {
        this.value = value;
        this.naipes = naipes;
    }

    @Override
    public String toString(){
        return "" + value + " " + naipes;
    }

}



package LowLevelDesign.DesignATM;

import com.conceptandcoding.LowLevelDesign.DesignATM.Card;

public class User {

    Card card;
    UserBankAccount bankAccount;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}

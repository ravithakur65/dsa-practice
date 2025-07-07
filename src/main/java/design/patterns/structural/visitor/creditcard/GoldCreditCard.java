package design.patterns.structural.visitor.creditcard;

import design.patterns.structural.visitor.offers.OfferVisitor;

public class GoldCreditCard implements CreditCards{
    @Override
    public String getName() {
        return "Gold";
    }

    @Override
    public void accept(OfferVisitor visitor) {
        visitor.visitGoldCreditCard(this);
    }
}

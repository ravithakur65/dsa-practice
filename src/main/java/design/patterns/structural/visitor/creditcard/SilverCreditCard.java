package design.patterns.structural.visitor.creditcard;

import design.patterns.structural.visitor.offers.OfferVisitor;

public class SilverCreditCard implements CreditCards{
    @Override
    public String getName() {
        return "Silver";
    }

    @Override
    public void accept(OfferVisitor visitor) {
        visitor.visitSilverCreditCard(this);
    }
}

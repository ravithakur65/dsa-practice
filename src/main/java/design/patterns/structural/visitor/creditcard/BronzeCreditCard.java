package design.patterns.structural.visitor.creditcard;

import design.patterns.structural.visitor.offers.OfferVisitor;

public class BronzeCreditCard implements CreditCards{
    @Override
    public String getName() {
        return "Bronze";
    }

    @Override
    public void accept(OfferVisitor visitor) {
        visitor.visitBronzeCreditCard(this);
    }


}

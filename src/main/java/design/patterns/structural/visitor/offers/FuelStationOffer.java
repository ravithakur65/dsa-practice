package design.patterns.structural.visitor.offers;

import design.patterns.structural.visitor.creditcard.CreditCards;

public class FuelStationOffer implements OfferVisitor{

    @Override
    public void visitBronzeCreditCard(CreditCards cc) {
        System.out.println("Fuel offer for Bronze credit card");
    }

    @Override
    public void visitSilverCreditCard(CreditCards cc) {
        System.out.println("Fuel offer for Silver credit card");

    }

    @Override
    public void visitGoldCreditCard(CreditCards cc) {
        System.out.println("Fuel offer for Gold credit card");

    }
}

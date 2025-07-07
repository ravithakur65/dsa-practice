package design.patterns.structural.visitor.offers;

import design.patterns.structural.visitor.creditcard.CreditCards;

public class GasStationOffer implements OfferVisitor{
    @Override
    public void visitBronzeCreditCard(CreditCards cc) {
        System.out.println("Gas Station offer for Bronze credit card");

    }

    @Override
    public void visitSilverCreditCard(CreditCards cc) {
        System.out.println("Gas Station offer for Silver credit card");

    }

    @Override
    public void visitGoldCreditCard(CreditCards cc) {
        System.out.println("Gas Station offer for Gold credit card");

    }
}

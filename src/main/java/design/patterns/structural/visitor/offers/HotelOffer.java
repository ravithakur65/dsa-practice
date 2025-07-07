package design.patterns.structural.visitor.offers;

import design.patterns.structural.visitor.creditcard.CreditCards;

public class HotelOffer implements OfferVisitor{
    @Override
    public void visitBronzeCreditCard(CreditCards cc) {
        System.out.println("Hotel offer for Bronze credit card");

    }

    @Override
    public void visitSilverCreditCard(CreditCards cc) {
        System.out.println("Hotel offer for Silver credit card");

    }

    @Override
    public void visitGoldCreditCard(CreditCards cc) {
        System.out.println("Hotel offer for Gold credit card");

    }
}

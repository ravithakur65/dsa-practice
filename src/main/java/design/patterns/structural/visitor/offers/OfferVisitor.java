package design.patterns.structural.visitor.offers;

import design.patterns.structural.visitor.creditcard.CreditCards;

public interface OfferVisitor {
    public void visitBronzeCreditCard(CreditCards cc);
    public void visitSilverCreditCard(CreditCards cc);
    public void visitGoldCreditCard(CreditCards cc);
}

package design.patterns.structural.visitor.creditcard;

import design.patterns.structural.visitor.offers.OfferVisitor;

public interface CreditCards {
    public String getName();
    public void accept(OfferVisitor visitor);
}

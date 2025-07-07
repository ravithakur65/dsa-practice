package design.patterns.structural.visitor;

import design.patterns.structural.visitor.creditcard.BronzeCreditCard;
import design.patterns.structural.visitor.creditcard.CreditCards;
import design.patterns.structural.visitor.creditcard.GoldCreditCard;
import design.patterns.structural.visitor.creditcard.SilverCreditCard;
import design.patterns.structural.visitor.offers.FuelStationOffer;
import design.patterns.structural.visitor.offers.GasStationOffer;
import design.patterns.structural.visitor.offers.HotelOffer;

public class Runner {
    public static void main(String[] args) {
        HotelOffer hotelOffer = new HotelOffer();
        FuelStationOffer fuelOffer = new FuelStationOffer();
        GasStationOffer gasOffer = new GasStationOffer();
        CreditCards bronzeCc = new BronzeCreditCard();
        CreditCards silverCC = new SilverCreditCard();
        CreditCards goldCC = new GoldCreditCard();

        bronzeCc.accept(hotelOffer);
        silverCC.accept(gasOffer);
        goldCC.accept(fuelOffer);
    }
}

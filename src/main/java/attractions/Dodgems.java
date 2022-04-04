package attractions;
import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed, IReviewed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrice() {
        return 4.50;
    }

    //Half price ticket charge for under 12's
    public double priceFor(Visitor visitor) {
        if (visitor.getAge() < 12) {
            return (defaultPrice() / 2);
        } else {
            return defaultPrice();
        }
    }
}

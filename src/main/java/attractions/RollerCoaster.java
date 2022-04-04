package attractions;
import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed, IReviewed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    //Needs to be over 12 years old & over 145cm tall
    public boolean isAllowedTo(Visitor visitor) {
        if ((visitor.getAge() > 12) && visitor.getHeight() > 145) {
            return true;
        } else {
            return false;
        }
    }

    public double defaultPrice() {
        return 8.40;
    }

    //Double charge for tall folk over 200cm
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 200) {
            return (defaultPrice() * 2);
        } else {
            return defaultPrice();
        }
    }
}

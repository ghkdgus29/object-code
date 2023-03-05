package chapter1.good;

public class Audience {

    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long buy(Ticket ticekt) {
        return bag.hold(ticekt);
    }
}

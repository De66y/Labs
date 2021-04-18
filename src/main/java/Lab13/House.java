package Lab13;

import javaa.lab10.Human;

public class House<T extends Human> {
    private T owner;

    public House(T owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return String.format("This house is owned by [%s] and is says %s.",owner, owner.greet());
    }
}

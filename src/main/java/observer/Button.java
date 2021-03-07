package observer;

import java.util.ArrayList;
import java.util.List;

public class Button {
    private final List<Actionable> observers = new ArrayList<>();

    void register(Actionable actionable) {
        observers.add(actionable);
    }

    void onClick() {
        observers.forEach(Actionable::doAction);
    }
}

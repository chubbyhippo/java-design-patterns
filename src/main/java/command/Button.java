package command;

public class Button {
    private final Command action;

    public Button(Command action) {
        this.action = action;
    }

    public void onClick() {
        action.execute();
    }

}

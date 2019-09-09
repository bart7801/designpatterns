package decorator.personalinfo_zad;

public class DecrementDecorator implements PersonalInfo {

    private PersonalInfo currentDecoratedObject;

    public DecrementDecorator(PersonalInfo currentDecoratedObject) {
        this.currentDecoratedObject = currentDecoratedObject;
    }


    @Override
    public int getPrintInfo() {
        return currentDecoratedObject.getPrintInfo() - 1;
    }
}


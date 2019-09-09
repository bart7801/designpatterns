package decorator.personalinfo_zad;

public class IncrementDecorator implements PersonalInfo {

    private PersonalInfo currentDecoratedObject;

    public IncrementDecorator(PersonalInfo currentDecoratedObject) {
        this.currentDecoratedObject = currentDecoratedObject;
    }


    @Override
    public int getPrintInfo() {
        return currentDecoratedObject.getPrintInfo() + 1;
    }
}



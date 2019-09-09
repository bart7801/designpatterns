package builder.schema;

public class CarBuilder {

    private Car car;

    public CarBuilder() {
        car = new Car();

        car.setModel("Multipla");
        car.setModel("Fiat");
        car.setYear(2000);
        car.setColor(CarColour.RED);
        car.setEngine(new CarEngineBuilder().build());
    }

    public CarBuilder withModel(String model){
        if (model.equals("Passat")) {
            System.out.println("mokro");

        }

        car.setModel(model);
        return this;
    }

    public CarBuilder withMake(String make) {
        car.setMake(make);
        return this;
    }

    public CarBuilder withColour(CarColour colour){
        car.setColor(colour);
        return this;
    }

    public CarBuilder withPinkColour(){
        car.setColor(CarColour.PINK);
        return this;
    }

    public CarBuilder mokrySenKaszuba(){
        car.setMake("VW");
        car.setModel("Passat");
        return this;
    }

    public CarBuilder mokrySenKaszuba2(){
        return withModel("Passat")
                .withMake("VW");
    }

    public CarBuilder withEquipment(Equipment equipment){
        car.getEquipmentList().add(equipment);
        return this;
    }

    public CarBuilder withEngine(CarEngine engine){
        car.setEngine(engine);
        return this;
    }

    public Car build(){
        return car;
    }
}

package builder.schema;

import static builder.schema.FuelType.*;

public class CarEngineBuilder {

    private CarEngine engine;

    public CarEngineBuilder(){
        engine = new CarEngine();

        engine.setCc(1995);
        engine.setCylinders(4);
        engine.setFuelType(DIESEL);
        engine.setEnginType(EnginType.SPALINOWY);
    }

    public CarEngineBuilder withCC(int cc){
        engine.setCc(cc);
        return this;
    }

    public CarEngineBuilder witCylinders(int cylinders){
        engine.setCylinders(cylinders);
        return  this;
    }

    public CarEngineBuilder withDiesel(){
        engine.setFuelType(DIESEL);
        return  this;
    }

    public CarEngineBuilder withGasoline(){
        engine.setFuelType(PETROL);
        return this;
    }

    public CarEngineBuilder withV8(){
        return withCC(5000)
                .witCylinders(8)
                .withGasoline();
    }

    public CarEngine build(){
        return engine;
    }
}

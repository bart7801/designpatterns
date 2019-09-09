package builder.schema;

public class Main {

    public static void main(String[] args){
        Car car = new CarBuilder()
                .withMake("VW")
                .withModel("Passat")
                .withPinkColour()
                .build();

        Car mokrySenKaszuba = new CarBuilder()
                .mokrySenKaszuba()
                .withEquipment(Equipment.ABS)
                .withEquipment(Equipment.PAS)
                .withEquipment(Equipment.NAVI)
                .withEquipment(Equipment.VELUR)
                .withEngine(new CarEngineBuilder()
                        .withV8()
                        .build())
                .build();

        System.out.println(mokrySenKaszuba);

    }
}

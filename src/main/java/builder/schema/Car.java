package builder.schema;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Car {
    private String model;
    private String make;
    private int year;
    private CarColour color;
    private List<Equipment> equipmentList = new ArrayList<>();
    private CarEngine engine;
}

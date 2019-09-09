package builder.schema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CarEngine {
    private int cc;
    private int cylinders;
    private FuelType fuelType;
    private EnginType enginType;
}

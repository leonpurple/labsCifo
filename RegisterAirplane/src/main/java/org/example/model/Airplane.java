package org.example.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Airplane {

    private String airplaneId;
    private String brand;
    private String model;
    private Fuselage fuselage;


    @Override
    public String toString() {
        return "Airplane{" +
                "airplaneId=" + airplaneId +
                ", brand= '" + brand + '\'' +
                ", model= " + model +
                ", fuselage= " + fuselage + '\'' +
                '}';
    }
}

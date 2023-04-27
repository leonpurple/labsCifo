package org.example.manager;

import java.util.ArrayList;
import java.util.List;

import org.example.model.Airplane;

public class AirplaneManager {

    private List<Airplane> airplanes;

    public AirplaneManager() {
        this.airplanes = new ArrayList<>();
    }

    public void registerAirplane(Airplane airplane) {
        this.airplanes.add(airplane);
    }

    public Airplane getAirplaneByBrandAndModel(String brand, String model) {
        return this.airplanes.stream()
                .filter(a -> a.getBrand().equals(brand) && a.getModel().equals(model))
                .findFirst()
                .orElse(null);
    }

    public List<Airplane> getAllAirplanes() {
        return this.airplanes;
    }

}

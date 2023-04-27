package org.example;

import org.example.model.Airplane;
import org.example.model.Fuselage;
import org.example.model.Pilot;
import org.example.service.RegisterAirplaneService;

public class Main {

    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", "737", new Fuselage("Hybrid"));
        Pilot pilot = new Pilot("John", "Doe", "30", 1234);
        RegisterAirplaneService service = new RegisterAirplaneService();
        service.registerAirplane(airplane, pilot, "27/04/2023");
    }

}
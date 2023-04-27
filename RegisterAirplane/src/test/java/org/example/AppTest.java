package org.example;

import org.example.manager.AirplaneManager;
import org.example.manager.PilotManager;
import org.example.model.Airplane;
import org.example.model.Fuselage;
import org.example.model.Pilot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    private AirplaneManager airplaneManager;
    private PilotManager pilotManager;


    @BeforeEach
    public void setUp() {
        airplaneManager = new AirplaneManager();
        pilotManager = new PilotManager();
    }

    @Test
    public void testRegisterAirplane() {
        Airplane airplane = new Airplane();
        airplane.setBrand("Boeing");
        airplane.setModel("747");
        Fuselage fuselage = new Fuselage();

        fuselage.setHybrid("Hybrid");
        fuselage.setLightweight("Lightweight");
        fuselage.setUltralight("Ultralight");
        airplane.setFuselage(fuselage);
        airplaneManager.registerAirplane(airplane);
        assertEquals(1, airplaneManager.getAllAirplanes().size());
    }

    @Test
    public void testRegisterPilot() {
        Pilot pilot = new Pilot("Lucas","Lopez","47",888888);
        pilot.setName("John");
        pilot.setSurname("Doe");
        pilot.setAge("35");
        pilot.setLicence(123456789);
        pilotManager.registerPilot(pilot);
        assertEquals(1, pilotManager.getAllPilots().size());
    }

}

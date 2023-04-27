package org.example.manager;

import java.util.ArrayList;
import java.util.List;


import org.example.model.Pilot;

public class PilotManager {

    private List<Pilot> pilots;

    public PilotManager() {
        this.pilots = new ArrayList<>();
    }


    // add new Pilot
    public void registerPilot(Pilot pilot) {
        this.pilots.add(pilot);
    }

    // access to Pilots register
    public List<Pilot> getAllPilots() {
        return this.pilots;
    }

}

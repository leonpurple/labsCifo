package org.example.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.example.model.Airplane;
import org.example.model.Pilot;

public class RegisterAirplaneService {

    public String registerAirplane(Airplane airplane, Pilot pilot, String date) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = date;
        try {
            Date d = formatter.parse(date);
            formattedDate = formatter.format(d);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String message = "Registered for the date " + formattedDate + " by " + pilot.getName() + " " + pilot.getSurname()
                + " :: " + airplane.getBrand() + ", " + airplane.getModel() + " :: " + airplane.getFuselage();
        System.out.println(message);
        return message;
    }

}
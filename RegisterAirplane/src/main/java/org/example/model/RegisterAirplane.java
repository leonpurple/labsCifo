package org.example.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RegisterAirplane {
    private Airplane airplane;
    private Pilot pilot;
    private Date date;

    public RegisterAirplane(Airplane airplane, Pilot pilot, Date date) {
        this.airplane = airplane;
        this.pilot = pilot;
        this.date = date;
    }

    public void register() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = formatter.format(this.date);
        System.out.println("RegisterAirplane dice: registrado para la fecha " + formattedDate +
                ", por el " + this.pilot.getName() + " " + this.pilot.getSurname() +
                ", avión marca " + this.airplane.getBrand() + ", fuselaje " + this.airplane.getFuselage());
    }
}







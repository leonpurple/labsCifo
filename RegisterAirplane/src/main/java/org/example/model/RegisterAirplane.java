package org.example.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsconstructor;

@Data
@AllArgConstructor
@NoArgsConstructor
public class RegisterAirplane {

    private Airplane airplane;
    private Pilot pilot;
    private Date date;

    private String RegisterStatus;



}







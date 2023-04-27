package org.example.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pilot extends Person {
    int Licence;

    public Pilot(String john, String doe, String s, int i){

    }

}

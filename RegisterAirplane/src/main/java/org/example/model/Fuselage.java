package org.example.model;


import lombok.Data;



@Data



public class Fuselage {
    String hybrid;
    String lightweight;
    String ultralight;

   public Fuselage(String i){
       this.hybrid = i;
       this.lightweight = i;
       this.ultralight = i;


    }

    public Fuselage() {

    }
}

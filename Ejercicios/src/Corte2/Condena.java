/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Corte2;

/**
 *
 * @author UIS
 */
import java.util.Date;

public class Condena {

    private String delito;
    private int años;


    public Condena(String delito, int años) {
        this.delito = delito;
        this.años = años;
    }

    public String getDelito() {
        return delito;
    }

    public int getAños() {
        return años;
    }

}

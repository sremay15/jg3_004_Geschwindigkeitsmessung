
import java.time.LocalDate;
import java.time.LocalTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcs
 */
public class Geschwindigkeitsmessung {
    
    private String kennzeichen;
    private LocalDate date;
    private LocalTime time;
    private int verlaubt, vgemessen;

    public Geschwindigkeitsmessung(String kennzeichen, LocalDate date, LocalTime time, int verlaubt, int vgemessen) {
        this.kennzeichen = kennzeichen;
        this.date = date;
        this.time = time;
        this.verlaubt = verlaubt;
        this.vgemessen = vgemessen;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public int getVerlaubt() {
        return verlaubt;
    }

    public void setVerlaubt(int verlaubt) {
        this.verlaubt = verlaubt;
    }

    public int getVgemessen() {
        return vgemessen;
    }

    public void setVgemessen(int vgemessen) {
        this.vgemessen = vgemessen;
    }

   public boolean isCheck(){
       return true;
   }
    
    
    
}

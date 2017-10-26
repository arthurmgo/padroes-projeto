/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author arthu
 */
public class Oraculo {
    
    private static Oraculo instance;
    private Calendar fimMundo = new GregorianCalendar(2012, Calendar.DECEMBER, 22);
    private Boolean hojeChove = true;
    
    public static Oraculo getInstance(){
        if(instance == null){
            instance = new Oraculo();
        }
        return instance;
    }
    
    private Oraculo(){
    }

    public Calendar getFimMundo() {
        return fimMundo;
    }

    public void setFimMundo(Calendar fimMundo) {
        this.fimMundo = fimMundo;
    }

    public Boolean getHojeChove() {
        return hojeChove;
    }

    public void setHojeChove(Boolean hojeChove) {
        this.hojeChove = hojeChove;
    }
    
    
    
    
    
}
    
    

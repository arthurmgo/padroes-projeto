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
    private Calendar fimMundo;
    private Boolean hojeChove;
    
    public static Oraculo getInstance(){
        if(instance == null){
            instance = new Oraculo();
        }
        return instance;
    }
    
    private Oraculo(){
        this.fimMundo = new GregorianCalendar(22, 12, 2012);
        this.hojeChove = true;
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
    
    

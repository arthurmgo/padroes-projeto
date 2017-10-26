/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 *
 * @author arthu
 */
public class Teste {
    
    
    
    public static void main(String[] args) {
        
        Locale locale = Locale.getDefault();
        
        Oraculo o1 = Oraculo.getInstance();
        System.out.println(o1.getFimMundo().getDisplayName(Calendar.DATE, Calendar.LONG, locale));
        
        Calendar hoje = new GregorianCalendar(26, 10, 2017);
        Oraculo o2 = Oraculo.getInstance();
        o2.setFimMundo(hoje);
        
        System.out.println(o2.getFimMundo());
        
    }
    
}

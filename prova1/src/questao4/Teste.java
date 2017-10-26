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
public class Teste {
    
    
    public static void main(String[] args) {
        
        // Gera um objeto o1
        Oraculo o1 = Oraculo.getInstance();
        System.out.println(o1.getFimMundo().getTime());
        if(o1.getHojeChove()){
            System.out.println("Vai Chover Hoje");
        }else{
            System.out.println("Nao Vai Chover Hoje");
        }
            
        //Gera um objeto o2
        Oraculo o2 = Oraculo.getInstance();
        System.out.println(o2.getFimMundo().getTime());
        if(o2.getHojeChove()){
            System.out.println("Vai Chover Hoje");
        }else{
            System.out.println("Nao Vai Chover Hoje");
        }
        
        
        //Modifica a data apenas da instancia o2
        Calendar hoje = new GregorianCalendar(2017, Calendar.OCTOBER,27);
        o2.setFimMundo(hoje);
        o2.setHojeChove(false);
        
        
        //Imprime a Data para cada uma das instancias
        System.out.println(o1.getFimMundo().getTime());
        if(o1.getHojeChove()){
            System.out.println("Vai Chover Hoje");
        }else{
            System.out.println("Nao Vai Chover Hoje");
        }
        System.out.println(o2.getFimMundo().getTime());
        if(o2.getHojeChove()){
            System.out.println("Vai Chover Hoje");
        }else{
            System.out.println("Nao Vai Chover Hoje");
        }
        
        
    }
    
}

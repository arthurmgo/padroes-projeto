/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

/**
 *
 * @author arthu
 */
public class ConfeiteiroMain {
    
    public static void main(String[] args) {
        ConfeiteiroDoce cd = new ConfeiteiroDoce();
        ConfeiteiroSalgado cs = new ConfeiteiroSalgado();
        
        Esfirra e = cs.novoAssado();
        e.setAberta(true);
        e.setTipoRecheio("Carne");
        
        
        Pastel p = cs.novoFrito();
        p.setRequeijao(true);
        p.setTipoRecheio("Queijo");
        
        Torta t = cd.novoAssado();
        t.setTampa(false);
        t.setTipoRecheio("Chocolate");
        
        
        Churros c = cd.novoFrito();
        
        
        
        
        
    }
    
}
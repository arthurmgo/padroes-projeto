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
public class Teste {
    
    public static void main(String[] args) {
        
        ConfeiteiroDoce cd = ConfeiteiroDoce.getInstance();
        ConfeiteiroSalgado cs =  ConfeiteiroSalgado.getInstance();
        
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
        c.setCobertura("Brigadeiro");
        c.setTipoRecheio("Doce de Leite");
        
        
        System.out.println(e);
        System.out.println(p);
        System.out.println(t);
        System.out.println(c);
        
        
        
        
    }
    
}

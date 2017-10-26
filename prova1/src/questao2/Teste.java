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
        
        // Utiliza Singleton para criar as Fabricas
        ConfeiteiroDoce cd = ConfeiteiroDoce.getInstance();
        ConfeiteiroSalgado cs =  ConfeiteiroSalgado.getInstance();
        
        // Cria o produtos de cada fabrica e define alguns valores
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
        
        
        // Imprime os produtos criados 
        
        System.out.println(e);
        System.out.println(p);
        System.out.println(t);
        System.out.println(c);
        
        
        
        
    }
    
}

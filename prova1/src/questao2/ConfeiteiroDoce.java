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
public class ConfeiteiroDoce implements InterfaceConfeiteiroDoce<Churros, Torta> {

    private static ConfeiteiroDoce instance;
    
    public static ConfeiteiroDoce getInstance(){
        if(instance == null){
            instance = new ConfeiteiroDoce();
        }
        return instance;
    }
    
    @Override
    public Torta novoAssado() {
        return new Torta();
    }

    @Override
    public Churros novoFrito() {
        return new Churros();
    }
    
}

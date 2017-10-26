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
public class ConfeiteiroSalgado implements InterfaceConfeiteiroSalgado<Pastel, Esfirra>{

    private static ConfeiteiroSalgado instance;
    
    public static ConfeiteiroSalgado getInstance(){
        if(instance == null){
            instance = new ConfeiteiroSalgado();
        }
        return instance;
    }
    
    @Override
    public Pastel novoFrito() {
        return new Pastel();
    }

    @Override
    public Esfirra novoAssado() {
        return new Esfirra();
    }
    
}

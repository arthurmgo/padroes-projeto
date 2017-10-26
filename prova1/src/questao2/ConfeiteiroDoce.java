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

    @Override
    public Torta novoAssado() {
        return new Torta();
    }

    @Override
    public Churros novoFrito() {
        return new Churros();
    }
    
}

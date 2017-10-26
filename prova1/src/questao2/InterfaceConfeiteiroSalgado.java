/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

/**
 *
 * @author arthu
 * @param <F>
 * @param <A>
 */
public interface InterfaceConfeiteiroSalgado <F extends Frito & Salgado, A extends Assado & Salgado> extends Confeiteiro<F, A>  {
    
}

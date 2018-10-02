/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno.game;

/**
 *
 * @author Usuario
 */
public class reverse extends DecoraAccion implements ActivarCarta{
    
    public reverse(Carta c, ActivarCarta f) {
        super(c, f);
        function();
    }

    @Override
    public void function() {
       System.out.println("reversando");
    }
    
}

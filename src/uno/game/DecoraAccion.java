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
public class DecoraAccion extends DecorarCarta{
    
    ActivarCarta exec;
    public DecoraAccion(Carta c,ActivarCarta f) {
        super(c);
        exec=f;
    }

    @Override
    public void jugarCarta() {
        getCarta().jugarCarta();
        exec.function();
    }
}

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
public abstract class DecorarCarta implements Carta{
    private Carta carta;
    
    public DecorarCarta(Carta c){
        this.carta=c;
    }

    public Carta getCarta() {
        return carta;
    }
    
}

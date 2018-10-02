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
public class CartaBase implements Carta{

    public CartaBase() {
    }

    @Override
    public void jugarCarta() {
        System.out.println("jugar");
    }
    public void funcion (ActivarCarta unaFuncion) {
        unaFuncion.function();}
    
}

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

public class UnoGame {

    /**
     * @param args the command line arguments
     */
      
    public static void main(String[] args) {
        ActivarCarta reversa=new ActivarCarta(){ public void function(){ } };
        Carta carta = new reverse(new DecoraValor(new CartaBase(),1000),reversa);
        carta.jugarCarta();

    }
    
}

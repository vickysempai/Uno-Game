/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unogame;

/**
 *
 * @author Camacho
 */
public class CartaBase implements ICarta{

    public CartaBase() {
    }

    @Override
    public void jugarCarta() {
        System.out.println("carta jugada");
    }

	@Override
	public boolean comparar(DecorarCarta carta, DecorarCarta revisar) {
		return false;
	}

    
    
}

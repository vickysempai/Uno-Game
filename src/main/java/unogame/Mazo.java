/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unogame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Victor Camacho
 */

public class Mazo extends BaseDeck{
	private List<String> colors = new ArrayList<String>();
	
	public Mazo() {
	colors.add("blue");
    colors.add("red");
    colors.add("green");
    colors.add("yellow");
    int i;
    for (String item : colors){
    	i=0;
        mazo.add(new DecoraColor(new DecoraValor(new CartaBase(),i),item));//cero
        for(i=1;i<10;i++){
        	mazo.add(new DecoraColor(new DecoraValor(new CartaBase(),i),item));//se repite cada valor 2 veces
        	mazo.add(new DecoraColor(new DecoraValor(new CartaBase(),i),item));
        }
            //come2
            //come2
            //reversa
            //reversa
            //pasar
            //pasar
        }
        scrambleCards();
	}

	ICarta getCard() {
		ICarta card = mazo.get(index);
		index++;
        if (index==mazo.size()){
            scrambleCards();
            index=0;
        }
        return card;
	}

	void scrambleCards() {
		Collections.shuffle(mazo);
		
	}
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unogame;



/**
/**
 *
 * @author Victor_Camacho
 */

enum Decors{
	ACTION,
	VALUE,
	COLOR
	
}

public abstract class DecorarCarta implements ICarta{
    private ICarta carta;
    
    public DecorarCarta(ICarta c){
        this.carta=c;
        //this.decorador = decorador;
    }

    public abstract Decors getDecor();
    /*
    public void decorar() {
    	//this.decorador.decorar();
    }*/

    public ICarta getCarta() {
        return carta;
    }
   /* 
    public static getValor(DecorarCarta decorador) {
    	switch(decorador.getDecor()) {
    	Decors.ACTION
    	}
    }*/
    
}

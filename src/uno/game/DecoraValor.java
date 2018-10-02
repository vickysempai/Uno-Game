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
public class DecoraValor extends DecorarCarta{
    private int valor;
    
    public DecoraValor(Carta c,int v){
        super(c);
        valor=v;
    }
    
    public int getvalor(){
        System.out.println(valor);
        return valor;
    }

    @Override
    public void jugarCarta() {
        getCarta().jugarCarta();
        System.out.println(valor);
    }
}

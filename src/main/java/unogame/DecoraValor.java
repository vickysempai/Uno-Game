/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unogame;


/**
 *
 * @author Victor Camacho
 */




public class DecoraValor extends DecorarCarta{
    private Integer number;
    private final Decors decorType = Decors.VALUE;
    
    public DecoraValor(ICarta c,Integer v){
        super(c);
        number=v;
    }
    
    @Override
    public Decors getDecor() {
    	return decorType;
    }
    
    public int getvalor(){
        return this.number;
    }

    @Override
    public void jugarCarta() {
        getCarta().jugarCarta();
        System.out.println(number);
    }

    @Override
	public boolean comparar(DecorarCarta carta,DecorarCarta revisar) {
		if(carta.getDecor()==this.decorType) {
			DecoraValor carta1=(DecoraValor)carta;
			DecoraValor carta2=(DecoraValor)revisar;
			 if(carta1.getvalor()==carta2.getvalor())
				 return true;
		}
		return getCarta().comparar(carta,revisar);
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unogame;


/**
 *
 * @author Victor_Camacho
 */

public class DecoraColor extends DecorarCarta{
    private String color;
    private final Decors decorType = Decors.COLOR;
    
    public DecoraColor(ICarta c,String color) {
        super(c);
        this.color=color;
    }

    @Override
    public void jugarCarta() {
        getCarta().jugarCarta();
        System.out.println(color);
    }
    
    public String getColor() {
		return this.color;
	}
    
	@Override
	public Decors getDecor() {
		return decorType;
	}

	@Override
	public boolean comparar(DecorarCarta carta, DecorarCarta revisar) {
		if(carta.getDecor()==this.decorType) {
			DecoraColor carta1=(DecoraColor)carta;
			DecoraColor carta2=(DecoraColor)revisar;
			 if(carta1.getColor()==carta2.getColor())
				 return true;
		}
		return getCarta().comparar(carta,revisar);
	}
    
}

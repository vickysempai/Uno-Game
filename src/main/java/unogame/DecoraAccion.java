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
public class DecoraAccion extends DecorarCarta{
	
    //private DecorarCarta decorador;

    private final Decors decorType = Decors.VALUE;
    
    ActivarCarta exec;
    public DecoraAccion(ICarta c,ActivarCarta f) {
        super(c);
        exec=f;
    }
    

    @Override
    public void jugarCarta() {
        getCarta().jugarCarta();
        exec.function();
    }

	@Override
	public Decors getDecor() {
		return decorType;
	}


	@Override
	public boolean comparar(DecorarCarta carta, DecorarCarta revisar) {
		if(carta.getDecor()==this.decorType) {
			DecoraValor carta1=(DecoraValor)carta;
			DecoraValor carta2=(DecoraValor)revisar;
			 if(carta1.getvalor()==carta2.getvalor())
				 return true;
		}
		return getCarta().comparar(carta,revisar);
	}
}

package unogame;

public class Persona {
	String id;
	MazoSimple miscartas= new MazoSimple();
	Persona(String id){
		this.id=id;
	}
	public void agregarCarta(ICarta card) {
		miscartas.putCard(card);
	}
	public ICarta jugarCarta(int pos) {
		if((pos>0)&&(pos< miscartas.largo()))
		    return miscartas.getCard(pos);
		return miscartas.getTopCard();
	}
}

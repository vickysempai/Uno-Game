/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package unogame;

import java.util.ArrayList;

/**
 *
 * @author Victor_Camacho
 */

public class UnoGame  implements reverse,salto
{
	ArrayList<Persona> users;
	Mazo mazo=new Mazo();
	MazoSimple mesa= new MazoSimple();
	boolean reversa=false;
	
	//indice de usuarios
	int index=0;
	
	public void addUser(String user){
		Persona usuario=new Persona(user);
		if (!(users.contains(usuario))) {//sino lo contiene lo agrega
		    this.users.add(usuario);
		    index++;
		    }
	}
	
	public void siguiente(){
		if (reversa) {
			if(index==0)
				index=users.size();
		    index--;
		}
		else 
			index++;
	}
	
	public void reversa(){
		if (reversa) {
			if(index==0)
				index=users.size();
		    index--;
		}
		else 
			index++;
	}
	
	public MazoSimple dealCard(MazoSimple mazo,int cantidad){
		//agrega cartas a un mazo
		for(int i=0;i!=cantidad;i++)
			mazo.putCard(this.mazo.getCard());
		return mazo;
	}
	
	public boolean actualUser(String actualUser){
		//ip contra el id del usuario que le toca el turno
		if(actualUser==users.get(index).id)
			return true;
		return false;
	}
	
	public void jugar(String usuario,Integer pos){																		
		if(actualUser(usuario)) {
			users.get(index).jugarCarta(pos);
		}
	}
	
	public void showPlayers(){
		for( Persona user: users) {
			System.out.println((user));
		}
	}
	public void iniciarJuego() {
		for(Persona user: users) {
			dealCard(user.miscartas,7);
		}
		dealCard(mesa,1);
	}
	
	public boolean canStart() {
		if (users.size()>2)
		    return false;
		return true;
	}
	
    /**
    * @param args the command line arguments
    */
    /*
    public static void main(String[] args) {
        ActivarCarta reversa=new ActivarCarta(){ public void function(){ } };
        Carta carta = new DecoraAccion(new DecoraValor(new CartaBase(),1000),reversa);
        carta.jugarCarta();
    } */
    
}

package unogame;

public class MazoSimple extends BaseDeck{
	public void putCard(ICarta card) {
		mazo.add(card);
		index++;
	}
	public ICarta getTopCard() {
		return mazo.get(index);
	}
	
	public ICarta getCard(int pos) {
		ICarta x = mazo.get(pos);
		mazo.remove(pos);
		return x;
	}
	
	public int largo() {
		return mazo.size();
	}
	
	/*public int comer(){
		int cont;//cartas a comer
		for(int i=mazo.size();i>0;i--) {
			   
			}
	}*/
}

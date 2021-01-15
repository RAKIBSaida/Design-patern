package personnages;
import comportements.ComportementPoignard;

public class Troll extends Personnage {

	public Troll() {
		this.comportementArme=new ComportementPoignard();
	}
	@Override
	public void combattre() {
		score+=1;
		System.out.println("je suis un troll");
		this.comportementArme.utiliserArme();
		System.out.println("score="+score);
		
	}

}

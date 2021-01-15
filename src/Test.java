import comportements.ComportementPoignard;
import personnages.Personnage;
import personnages.Reine;
import personnages.Roi;

public class Test {
	public static void main(String[] args) {
		Personnage reine=new Reine();
		reine.combattre();
		
		System.out.println("--------------");
		
		Personnage roi=new Roi();
		roi.setComportementArme(new ComportementPoignard());
		roi.combattre();
	}

}

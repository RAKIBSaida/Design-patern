package design_pattern_observer;

public class ObserverImpl1 implements Observer {

	@Override
	public void update(Observable observable) {
		int state=((ObservableImpl)observable).getState();
		double resultat=state*2+9;
		System.out.println("--------ObserverImpl1------------");
		System.out.println("Nouvelle mis à jour: state="+state);
		System.out.println("resultat de calcul :"+resultat);
		System.out.println("-----------------------------");
	}

}

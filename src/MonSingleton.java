
public class MonSingleton {
	
private static MonSingleton monSingleton;
private MonSingleton() {
	
}
public static MonSingleton getInstance() {
	if(monSingleton==null) {
		synchronized(MonSingleton.class) {
			if(monSingleton==null) {
				monSingleton=new MonSingleton();
			}
		}
	}
	return monSingleton;
}
}

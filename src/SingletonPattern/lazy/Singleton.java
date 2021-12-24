package SingletonPattern.lazy;

public class Singleton {
	private static Singleton singleton;
	private Singleton() {}
	public synchronized static Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
			return singleton;
		}else {
			return singleton;
		}
	}
}

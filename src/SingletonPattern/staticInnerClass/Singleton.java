package SingletonPattern.staticInnerClass;

public class Singleton {
	private static class SingletonLoader {
		private static final Singleton SINGLETON = new Singleton();
	}
	
	private Singleton(){}
	
	public static Singleton getInstance() {
		return SingletonLoader.SINGLETON;
	}
}

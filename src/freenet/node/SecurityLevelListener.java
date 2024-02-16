package freenet.node;

public interface SecurityLevelListener<T> {
	
	void onChange(T oldLevel, T newLevel);

}

package daynine.functionalinterface;

@FunctionalInterface
public interface ConsumerElement<T> {
	
	void acceptElement(T t);
	
}

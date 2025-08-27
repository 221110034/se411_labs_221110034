package lab02.data;


public class NumberBox<T extends Number> {
	private T element;
	public NumberBox(T... _element) {
		element = Arrays.asList(_element);
	}
	public T getItemt() {
		return element;
	}
	public void setItem(T element) {
		this.element = element;
	}
	
	public double NumSum(){
		
	}
}

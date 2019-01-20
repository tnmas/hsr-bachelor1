package collectionsInJava;


public class BasicFood extends Food{
	private int calories;
	public BasicFood(String name, int calories) {
		super(name);
		this.calories = calories;
	}	
	
	@Override
	public int getCalories() {
		return calories;
	}

	@Override
	public String toString(int indent) {
		return getIndent(indent) + getName() + " (" + getCalories() + " Kalorien)\n";
	}
	
}
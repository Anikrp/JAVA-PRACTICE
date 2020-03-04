package assigment;

public class Flower extends Plant{
	private boolean hasSmell;
	private boolean hasThron;
	
	public Flower(String name, String color,boolean hasSmell, boolean hasThron) {
		super(name, color);
		
		this.hasSmell= hasSmell;
		this.hasThron = hasThron;
	}

	public boolean isHasSmell() {
		return hasSmell;
	}

	public void setHasSmell(boolean hasSmell) {
		this.hasSmell = hasSmell;
	}

	public boolean isHasThron() {
		return hasThron;
	}

	public void setHasThron(boolean hasThron) {
		this.hasThron = hasThron;
	}

	@Override
	public String toString() {
		return "Flower [Name = "+ super.getName()+ ", Color = "+ super.getColor() + ", hasSmell=" + hasSmell + ", hasThron=" + hasThron + "]";
	}
	
}
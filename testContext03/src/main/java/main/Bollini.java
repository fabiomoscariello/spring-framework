package main;

public class Bollini 
{
	private int bollini;
	
	public Bollini()
	{
		System.out.println("Istanziata classe Bollini");
	}
	
	public int getBollini() {
		return bollini;
	}

	public void setBollini(int bollini) {
		this.bollini = bollini;
	}

	@Override
	public String toString() 
	{
		return bollini + " Bollini";
	}
}

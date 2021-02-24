public class BiasedCoin
{
	private final int HEADS = 0;
	private final int TAILS = 1;
	
	private int face;
	private double bias;
	
	public BiasedCoin()
	{
		bias = 0.5;
		flip();
	}
	
	public BiasedCoin(double par)
	{
		if (par >= 0 && par <= 1)
			bias = par;
		else
			bias = 0.5;
		
		flip();
	}
	
	public void flip()
	{
		double value = Math.random();
		
		if (value < bias)
			face = HEADS;
		else
			face = TAILS;
	}
	
	public boolean isHeads()
	{
		return (face == HEADS);
	}
	
	public String toString()
	{
		String faceName;
		
		if (face == HEADS)
			faceName = "Heads";
		else
			faceName = "Tails";
		
		return faceName;
	}
}

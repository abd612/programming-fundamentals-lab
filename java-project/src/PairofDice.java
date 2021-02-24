public class PairofDice
{
	private Die die1 = new Die();
	private Die die2 = new Die();
	
	public PairofDice()
	{
		die1.setFaceValue(0);
		die2.setFaceValue(0);
	}
	
	public void setDie1(int x)
	{
		die1.setFaceValue(x);
	}
	
	public void setDie2(int y)
	{
		die2.setFaceValue(y);
	}
	
	public int getDie1()
	{
		return die1.getFaceValue();
	}
	
	public int getDie2()
	{
		return die2.getFaceValue();
	}
	
	public void RollDice()
	{
		die1.roll();
		die2.roll();
	}
	
	public int Sum()
	{
		return die1.getFaceValue() + die2.getFaceValue();
	}
	
	public String toString()
	{
		String a = Integer.toString(die1.getFaceValue());
		String b = Integer.toString(die2.getFaceValue());
		return ("Die1: " + a + "\t" + "Die2: " + b);
	}
	
}

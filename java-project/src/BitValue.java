public class BitValue
{
	private boolean binaryDigit;
	
	public BitValue()
	{
		binaryDigit = false;
	}
	
	public void setBinaryDigit(boolean b)
	{
		binaryDigit = b;
	}
	
	public boolean getBinaryDigit()
	{
		return binaryDigit;
	}
	
	public String toString()
	{
		String result = Boolean.toString(binaryDigit);
		return result;
	}
}

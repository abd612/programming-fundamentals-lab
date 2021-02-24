public class Bits
{
	public static void main(String[] args)
	{
		BitValue bit0 = new BitValue();
		BitValue bit1 = new BitValue();
		BitValue bit2 = new BitValue();
		BitValue bit3 = new BitValue();
		
		bit1.setBinaryDigit(true);
		bit3.setBinaryDigit(true);
		
		System.out.print(bit0.getBinaryDigit() + " ");
		System.out.print(bit1.getBinaryDigit() + " ");
		System.out.print(bit2.getBinaryDigit() + " ");
		System.out.println(bit3.getBinaryDigit() + "\n");
		
		System.out.println(bit0);
		System.out.println(bit1);
		System.out.println(bit2);
		System.out.println(bit3);
	}
}

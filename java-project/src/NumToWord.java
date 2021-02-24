import java.util.Scanner;
public class NumToWord {
private static final String[] tensNames = {
"",
" Ten",
" Twenty",
" Thirty",
" Forty",
" Fifty",
" Sixty",
" Seventy",
" Eighty",
" Ninety"
};
private static final String[] numNames = {
"",
" One",
" Two",
" Three",
" Four",
" Five",
" Six",
" Seven",
" Eight",
" Nine",
" Ten",
" Eleven",
" Twelve",
" Thirteen",
" Fourteen",
" Fifteen",
" Sixteen",
" Seventeen",
" Eighteen",
" Nineteen"
};
public static void main(String []args)
{
Scanner reader = new Scanner(System.in);
System.out.println("Enter a whole number (max 4 digits): ");
int n = reader.nextInt();
System.out.println(n);
reader.close();
int units = n%10;
int tens = (n%100 - units)/10;
int hundreds = (n%1000 - (tens+units))/100;
int thousands = (n-(n%1000))/1000;
System.out.println("In the thousands place: " +thousands);
System.out.println("In the hundreds place: " +hundreds);
System.out.println("In the tens place: " +tens);
System.out.println("In the units place: " +units);
if(n==0)
System.out.println("Zero");
else if(n<10)
System.out.println(numNames[units]);
else if(n<100)
System.out.println(tensNames[tens]+""+numNames[units]);
else if(n<1000)
{
if(tens==0&&units==0)
System.out.println(numNames[hundreds]+" Hundred");
else if(tens==0&&units!=0)
System.out.println(numNames[hundreds]+" Hundred and"+numNames[units]);
else
System.out.println(numNames[hundreds]+" Hundred and"+tensNames[tens]+""+numNames[units]);
}
else if(n<10000)
{
if(hundreds==0&&tens==0&&units==0)
System.out.println(numNames[thousands]+" Thousand");
else if(hundreds==0&&tens==0&&units!=0)
System.out.println(numNames[thousands]+" Thousand and"+numNames[units]);
else if(hundreds==0&&tens!=0)
System.out.println(numNames[thousands]+" Thousand and"+tensNames[tens]+""+numNames[units]);
else if(hundreds!=0&&tens==0&&units==0)
System.out.println(numNames[thousands]+" Thousand"+numNames[hundreds]+" Hundred");
else
System.out.println(numNames[thousands]+" Thousand"+numNames[hundreds]+" Hundred and"+tensNames[tens]+""+numNames[units]);
}
else System.out.println("Please enter a four digit whole number!(0-9999)");
}
}
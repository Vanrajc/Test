class Four
{
private int num1;
private int num2;

public Four(int num1,int num2)
{
this.num1=num1;
this.num2=num2;
}

public int getNum1()
{return num1;}

public int getNum1()
{return num2;}
}




public class B
{
public int getLastDigit(int num)
{return num % 10;}
}




public class c
{
public int multiplyLastDigits(int num1,int num2)
{
B b=new B();
int lastDigit1 = b.getLastDigit(num1);
int lastDigit2 = b.getLastDigit(num2);
return lastDigit1 * lastDigit2;
}
}
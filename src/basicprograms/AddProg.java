package basicprograms;
// non static variables are called through only objects 
class AddProg 
{
int num1=10;
int num2=20;
public void  addition()
{
	int result=num1+num2;
	System.out.println("THE ADDITION OF TWO NUMBERS:"+result);
}
public static void main(String[] args) 
{
	AddProg rep = new AddProg ();
	int num1prog= rep.num1;
	System.out.println("the num1 value is:"+num1prog);
	int num2prog=rep.num2;
	System.out.println("the num2 value is:"+num2prog);
	rep .addition();
}
}

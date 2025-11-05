import java.util.Scanner; 
class Test 
{
static boolean isPrime(int n)
{
int i;
for(i=2;i<n;i++)
{
if(n%i==0)
{
return false;
}
}
return true;
}
public static void main(String[] args)
{
int i,low,upr;
Scanner sc=new Scanner(System.in);
System.out.println("Enter lower limit : ");
low=sc.nextInt();
System.out.println("Enter upper limit : ");
upr=sc.nextInt();
System.out.println("Twin prime number are : ");
for(i=low;i<=upr-2;i++)
{
if(isPrime(i) && isPrime(i+2))
System.out.println(i+" "+(i+2));
}
}
}

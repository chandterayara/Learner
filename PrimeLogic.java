public class PrimeLogic
{
 
    private static boolean prime(int i)
    {
        int j;
        int c=0;
        String prime="not a";
        boolean isPrime = false;
        for(j=1;j<=i;j++)
        {
            if(i%j==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            prime = "a";
            isPrime = true;
        }
        System.out.println("in prime for " + i + "it is " + prime +" prime");
        return isPrime;
    }
    
    public static void main(String args[])
    {
        int i;
        int p=0;
        System.out.println("the prime number function");
        for(i=0;i<=100;i++)
        {
            if(prime(i)){
                p=i;
            }
        }
        System.out.println("the gretest prime number is:"+p);
    }
}

import java.util.*;
public class Largestprimeinarray
{
    static int N=100005;
    static boolean prime[]=new boolean[N+1];
    static void isPrime(int n)
    {
        for(int i=0;i<=N;i++)
        {
            prime[i]=true;
        }
        prime[0]=false;
        prime[1]=false;
        for(int x=2;x*x<=N;x++)
        {
            if(prime[x]==true)
            {
                for(int i=x*x;i<=N;i+=x)
                {
                    prime[i]=false;
                }
            }
        }
    }
    public static void main(String args[]) 
    {
        int n;
        int max=Integer.MIN_VALUE;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
        arr[i]=sc.nextInt();
        }
        isPrime(n);
        System.out.print("Largest Prime = ");
        for(int i=0;i<n;i++)
        {
        if(prime[arr[i]]==true)
        {
        if(arr[i]>max)
        {
        max=arr[i];
        }
        }
        }
        System.out.println(max);
    }
}

output1:
5
12 34 23 56 78
Largest Prime = 23

output2:
5
11 27 53 68 79
Largest Prime = 79
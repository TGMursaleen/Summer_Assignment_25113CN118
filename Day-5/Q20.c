#include<stdio.h>
int main()
{
    int n;
    printf("Enter the number to get it's largest prime factor: \n");
    scanf("%d",&n);
    int num=n,i,j,p_factor=0;
    for(i=2;i<=num;i++)
    {
        if(num%i==0)
        {
            int isprime=1;
            for(j=2;j*j<=i;j++)
            {
                if(i%j==0)
                {
                    isprime=0;
                    break;
                }
            }
            if(isprime==1)
            {
                p_factor=i;
            }
        }
    }
    printf("Largest prime facorial is %d",p_factor);
    return 0;
}    
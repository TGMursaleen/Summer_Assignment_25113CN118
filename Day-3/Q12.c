#include<stdio.h>
int main()
{
    int prod,i,gcd,lcm,n1,n2,f1,f2;
    printf("Enter the two numbers to get LCM: \n");
    scanf("%d%d",&n1,&n2);
    if(n1>n2)
    {
        for(i=1;i<=n1;i++)
        {
            f1=n1%i;
            f2=n2%i;
            if(f1==0&&f2==0)
            {
                gcd=i;
            }
        }
    }
    else
    {
        for(i=1;i<=n2;i++)
        {
            f1=n1%i;
            f2=n2%i;
            if(f1==0&&f2==0)
            {
                gcd=i;
            }
        }
    }
    prod=n1*n2;
    lcm=prod/gcd;
    printf("LCM of given two numbers is %d",lcm);
    return 0;
}    
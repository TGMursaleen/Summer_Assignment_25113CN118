#include<stdio.h>
int main()
{
    int i,u,l,isprime=1;
    printf("Enter the lower and upper range to get Prime Number in between: \n");
    scanf("%d \t %d",&l,&u);
    if(u<=l)
    {
        printf("Upper value should be greter then lower value!!!");
    }
    else
    {
        for(l;l<=u;l++)
        {
            if(l==1)
            {
                continue;
            }
            for(i=2;i<=l/2;i++)
            {
                if(l%i==0)
                {
                    isprime=2;
                    break;
                }
            }
            if(isprime==1)
            {
                if(l==0)
                {
                    continue;
                }
                {
                    printf("%d\t",l);
                }
            }
            isprime=1;
        }
    }
    return 0;
}   
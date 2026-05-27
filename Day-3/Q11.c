#include<stdio.h>
int main()
{
    int i,rem,n1,n2,f1,f2;
    printf("Enter the two numbers to check the GCD: \n");
    scanf("%d%d",&n1,&n2);
    if(n1>n2)
    {
        for(i=1;i<=n1;i++)
        {
            f1=n1%i;
            f2=n2%i;
            if(f1==0&&f2==0)
            {
                rem=i;
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
                rem=i;
            }
        }
    }
    printf("%d",rem);
    return 0;
}
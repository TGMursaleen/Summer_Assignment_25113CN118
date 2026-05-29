#include<stdio.h>
int main()
{
    int x,n;
    printf("Enter the value of base and power respectively: \n");
    scanf("%d%d",&x,&n);
    int pow=1,i;
    for(i=0;i<n;i++)
    {
        pow*=x;
    }
    printf("%d^%d = %d",x,n,pow);
}
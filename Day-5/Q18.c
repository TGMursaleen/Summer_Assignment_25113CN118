#include<stdio.h>
int main()
{
    int n;
    printf("Enter the number to check strong number: \n");
    scanf("%d",&n);
    int sum=0,j,num=n,lst,i;
    while(num!=0)
    {
        int fact=1;
        lst=num%10;
        for(j=1;j<=lst;j++)
        {
            fact*=j;
        }
        sum+=fact;
        num/=10;
    }
    if(n==sum)
    {
        printf("Entered number %d is a strong number",n);
    }
    else
    {
        printf("Entered number %d is not a strong number",n);
    }
    return 0;
}
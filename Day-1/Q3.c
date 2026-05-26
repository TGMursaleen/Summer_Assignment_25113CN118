#include<stdio.h>
int main()
{
    int fact=1,i,n;
    printf("Enter the number to find factorial: \n");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        fact=fact*i;
    }
    printf("Factorial of entered number is: %d",fact);
    return 0;
}
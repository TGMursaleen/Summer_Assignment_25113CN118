#include<stdio.h>
int main()
{
    int n,i,sum=0,lst;
    printf("Enter a number to get sum of digit: \n");
    scanf("%d",&n);
    while(n!=0)
    {
        lst=n%10;
        n=n/10;
        sum=sum+lst;
    }
    printf("The sum of digits is %d",sum);
    return 0;
}
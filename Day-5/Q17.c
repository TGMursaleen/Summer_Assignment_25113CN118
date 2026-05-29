#include<stdio.h>
int main()
{
    int n;
    printf("Enter the number to check for perfect number: \n");
    scanf("%d",&n);
    int rem,sum=0,num=n,i;
    for(i=1;i<num;i++)
    {
        rem=num%i;
        if(rem==0)
        {
            sum+=i;
        }
    }
    if(sum==n)
    {
        printf("Entered number %d is perfect number",n);
    }
    else
    {
        printf("Entered number %d is not a perfect number",n);
    }
    return 0;
}
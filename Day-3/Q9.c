#include<stdio.h>
int main()
{
    int rem,count=1,i=2,n;
    printf("Enter the number to check: \n");
    scanf("%d",&n);
    for(i=2;i<=n/2;i++)
    {
        rem = n%i;
        if(rem==0)
        {
            printf("Given number %d is a composite Number",n);
            count=count +1;
            break;
        } 
    }
    if(count==1)
    {
        printf("Given number %d is a Prime Number",n);
    }
    return 0;
}
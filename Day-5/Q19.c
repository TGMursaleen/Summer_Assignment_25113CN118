#include<stdio.h>
int main()
{
    int n;
    printf("Enter the number to get the factors: \n");
    scanf("%d",&n);
    int rem,fact,i,num=n;
    for(i=1;i<=num;i++)
    {
        rem=num%i;
        if(rem==0)
        {
            printf("%d\t",i);
        }
    }
    return 0;
}

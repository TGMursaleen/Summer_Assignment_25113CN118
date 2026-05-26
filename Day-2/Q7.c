#include<stdio.h>
int main()
{
    int lst,n,prod=1;
    printf("Enter the number to get the product: \n");
    scanf("%d",&n);
    while(n!=0)
    {
        lst=n%10;
        prod=prod*lst;
        n=n/10;
    }
    printf("product of number is %d",prod);
    return 0;
}
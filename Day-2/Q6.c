#include<stdio.h>
int main()
{
    int lst,n,rev=0;
    printf("Enter the number to reverse: \n");
    scanf("%d",&n);
    while(n!=0)
    {
        lst=n%10;
        rev=rev*10 + lst;
        n=n/10;
    }
    printf("Reversed number is %d",rev);
    return 0;
}
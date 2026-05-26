#include<stdio.h>
int main()
{
    int n,i=0,lst;
    printf("Enter the number to count digit: \n");
    scanf("%d",&n);
    while(n!=0)
    {
        lst=n%10;
        n=n/10;
        i=i+1;
    }
    printf("digit count= %d",i);
    return 0;
}
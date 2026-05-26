#include<stdio.h>
int main()
{
    int num,rev=0,n,lst;
    printf("Enter the number to check wheahter it is palindrom or not: \n");
    scanf("%d",&n);
    num=n;
    while(n!=0)
    {
        lst=n%10;
        rev=rev*10 + lst;
        n=n/10;
    }
    if(num==rev)
    {
        printf("Entered number %d is a palindrom",num);
    }
    else
    {
        printf("Entered number %d is not a palindrom",num);
    }
    return 0;
}
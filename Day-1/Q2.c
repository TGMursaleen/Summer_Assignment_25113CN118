#include<stdio.h>
int main()
{
    int i,n,num=0;
    printf("Enter the number to print the table:\n");
    scanf("%d",&n);
    printf("Table for the given number: %d\n",n);
    for(i=1;i<=10;i++)
    {
        num=n*i;
        printf("%d. %d\n",i,num);
    }
    return 0;
}
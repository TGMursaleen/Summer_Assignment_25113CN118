#include<stdio.h>
int main()
{
    int n;
    printf("Enter the binary number to count the set bits: \n");
    scanf("%d",&n);
    int i=0,flag=0,num=n,lst;
    while(num!=0)
    {
        lst=num%10;
        num/=10;
        if(lst!=0&&lst!=1)
        {
            flag=1;
            break;
        }
    }
    if(flag==1)
    {
        printf("Error!!! Enter a Binary Number");
    }
    else
    {
        while(n!=0)
        {
            lst=n%10;
            if(lst==1)
            {
                i+=1;
            }
            n/=10;
        }
        printf("%d",i);
    }
}
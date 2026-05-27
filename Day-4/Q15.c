#include<stdio.h>
#include<math.h>
int main()
{
    int n,len=0;
    printf("Enter the number to check wheather it is Armstrong or not: \n");
    scanf("%d",&n);
    int o_num=n;
    int num=n;
    while(n!=0)
    {
        n=n/10;
        len+=1;
    }
    int lst,sum=0,i;
    for(i=0;i<len;i++)
    {
        lst=num%10;
        sum+=round(pow(lst,len));
        num=num/10;
    }
    if(sum==o_num)
    {
        printf("Entered number is a Armstrong Number");
    }
    else if(sum!=o_num)
    {
        printf("Entered number is not a Armstrong number");
    }
    return 0;
}
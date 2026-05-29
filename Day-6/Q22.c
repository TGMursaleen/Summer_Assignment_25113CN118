//Binary to Decimal
//100=1*2^2+0*2^1+0*2^0
#include<stdio.h>
#include<math.h>
int main()
{
    int n;
    printf("Enter the Binary number to convert it into decimal number: \n");
    scanf("%d",&n);
    int sum=0,i,lst;
    int len=0,num=n;
    while(num!=0)
    {
        num/=10;
        len+=1;
    }
    for(i=0;i<len;i++)
    {
        lst=n%10;
        sum+=lst*round(pow(2,i));
        n/=10;
    }
    printf("%d",sum);
    return 0;
}
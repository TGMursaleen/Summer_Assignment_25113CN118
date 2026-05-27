#include<stdio.h>
int main()
{
    int t1=0,t2=1,nextterm,i,n;
    printf("Enter the nth term to get from fibonaccci: \n");
    scanf("%d",&n);
    for(i=0;i<n-1;i++)
    {
        nextterm=t1+t2;
        t1=t2;
        t2=nextterm;
    }
    printf("%d",t1);
    return 0;
}
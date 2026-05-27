#include<stdio.h>
int main()
{
    int nextterm,t1=0,t2=1,n,i;
    printf("Enter the no. of term: \n");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        printf("%d, ",t1);
        nextterm=t1+t2;
        t1=t2;
        t2=nextterm;
    }
    return 0;
}
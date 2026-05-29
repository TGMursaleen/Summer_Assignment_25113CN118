#include<stdio.h>
int main()
{
    int n; //n is storing decimal number
    printf("Enter the Decimal number to convert it into binary number: \n");
    scanf("%d",&n);
    int i=0,rem,j;
    int a[99]; //generating an array to store remainder that 0 or 1 in it
    if(n==0)
    {
        printf("%d",n);
    }
    while(n!=0)
    {
        rem=n%2; //retreiving 0 and 1 by dividing decimal number by 2 and the retereived remainder is needed in calculating the binary number
        a[i]=rem; //array storing the remainder after that we will reverse print this and this will be the final binary number
        i++; //i++ is used to increase the array indexing
        n/=2; //this used to stop the loop and divide the decimal number
    }
    for(j=i-1;j>=0;j--) //reversing the array to print binary number to given decimal number since remainder should be written in
    {                   //reverse order to get the actual binary number
        printf("%d",a[j]);
    }
    return 0;
}
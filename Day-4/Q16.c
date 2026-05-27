#include<stdio.h>
#include<math.h>
int main()
{
    int low,up;
    printf("Enter the lower and upper value to get Armstrong numbers: \n");
    scanf("%d%d",&low,&up);
    for(low;low<=up;low++)
    {
        int i,len=0,num=low,o_num=low;
        while(num!=0)
        {
            num=num/10;
            len+=1;
        }
        int sum=0,lst;
        for(i=0;i<len;i++)
        {
            lst=o_num%10;
            sum+=round(pow(lst,len));
            o_num/=10;
        }
        if(sum==low)
        {
            printf("%d\t",low);
        }
    }
    return 0;
}
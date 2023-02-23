class First
{
public static int findMax(Object[] arr)
{
int max=Integer.Min_VALUE;
for(Object item : arr)
{
if(item instanceof object[])
{
int nestedMax = findMax(Object[] item);

if(NestedMax>max)
{
max=nestedMax;

}
else if(item instanceof Integer)
{
int num=(int)item;
if(num>max)
{max=num;}
}
}
}
}
return max;
}
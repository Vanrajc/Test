class Second
{
public static int findMax(int[] arr)
{
int max=arr[0];
for(int i=0;i<arr.length;i++)
{
if(arr[i]>max)
{
max=arr[i];
}
} 
return max;
}

public static int
findMaxInJaggedArray(Object[] arr)
{
int max =Integer.Min_Value;
for(Object element : arr)
{
if(element instanceof Integer)
{
int num=(int) element;
if(num>max)
{
max = num;
}
}else if(element instanceof Object[])
{
int subMax=findMaxInJaggedArray((Object[]) element);
if (subMax >max)
{
max = subMax;
}
}
}
}
return max;
}

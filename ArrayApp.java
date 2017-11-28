class ArrayApp
{
    public static void main(String[] args)
    {
	long[] arr;
	arr = new long[100];
	int nElems = 0;
	int j;
	long search_key;

	//Create a 10 size array that random from 0-100;
	nElems = 10;
	for(j=0;j<nElems;j++)
	{
	    arr[j] = (long)(Math.random()*100.0);
	    System.out.print(arr[j] + " ");
        }
	System.out.println(" ");

	//Search the key num;
	search_key = 66;
	for(j=0;j<nElems;j++)
	{
	    if(arr[j] == search_key)
		break;
        }
	if(j == nElems)
	    System.out.println("can't find" + search_key);
	else
	    System.out.println("Found"+search_key+"in"+j);

	//delete item with key num
	search_key = 55;
	for(j=0;j<nElems;j++)
	{
	    if(arr[j] == search_key)
		break;
        }
	if(j == nElems)
	{
	    System.out.println("can't find"+search_key);
        }
	else
	{
	    for(int k = j;k<nElems;k++)
	    {
		arr[k] = arr[k+1];
	    }
	    nElems--;
	}


	//display items in array
	for(j=0;j<nElems;j++)
	{
	    System.out.print(arr[j]+" ");
	}
	System.out.println(" ");

    }
}
	

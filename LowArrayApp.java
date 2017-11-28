class LowArray
{
    private long[] mArray; //array

    public LowArray(int arraySize)  //constructor
    {
	mArray = new long[arraySize];   //create array with size
    }

    public void SetElement(int index, long value)
    {
	mArray[index] = value;
    }

    public long GetElement(int index)
    {
	return mArray[index];
    }

    public void DisplayElement(int index)
    {
	System.out.println("Array in "+index+" is "+mArray[index]);
    }
    
}

class LowArrayApp
{
    public static void main(String args[])
    {
	LowArray arr;
	arr = new LowArray(100);
	int nElems = 10;
	int j;


	//set the initial value;
	for(j=0;j<nElems;j++)
	{
	    arr.SetElement(j,(long)(Math.random()*100.0));
	}

	//Display array;
	for(j=0;j<nElems;j++)
	{
	    arr.DisplayElement(j);
	}

	//search

	int search_key = 55;
	for(j=0;j<nElems;j++)
	{
	    if(arr.GetElement(j) == search_key)
		break;
	}
	if(j == nElems)
	{
	    System.out.println("can't find "+ search_key);
	}
	else
	{
	    System.out.println("found!"+search_key);
	}

	
	
	

	
    }

}

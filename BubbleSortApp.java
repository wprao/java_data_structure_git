class BubbleSort
{
    public long[] mArray;
    public int nElems;

    public BubbleSort(int max)
    {
	mArray = new long[max];
	nElems = 0;
    }

    public void insert(long value)
    {
	mArray[nElems] = value;
	nElems++;
    }

    public void display()
    {
	for(int i=0;i<nElems;i++)
	    {
		System.out.print(mArray[i] + " ");
	    }
	System.out.println(" ");
    }

    public void BubbleSortMethod()
    {
	int i,j;
	for(j=nElems-1;j>0;j--)
	    {
		for(i=0;i<j;i++)
		    {
			if(mArray[i] > mArray[i+1])
			    Swap(i,i+1);
			System.out.println(i+" "+j+" ");
		    }
 
	    }
    }

    private void Swap(int value1, int value2)
    {
	long temp = mArray[value1];
	mArray[value1] = mArray[value2];
	mArray[value2] = temp;
    }
}

class BubbleSortApp
{
    public static void main(String args[])
    {
	BubbleSort arr;
	arr = new BubbleSort(100);

	for(int j = 0;j<100;j++)
	    {
		arr.insert((long)(Math.random()*1000.0));
	    }

	arr.display();
	arr.BubbleSortMethod();
	arr.display();
	
    }
}

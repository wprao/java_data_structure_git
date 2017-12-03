class SortCompare
{
    long[] mArrayOrigin;
    long[] mArray;
    int nElems;
    
    public SortCompare(int max)
    {
	mArray = new long[max];
	mArrayOrigin = new long[max];
	nElems = 0;
    }

    public void insert(long value)
    {
	mArray[nElems] = value;
	mArrayOrigin[nElems] = value;
	nElems++;
    }

    public void display()
    {
	System.out.println("Origin data:");
	for(int i=0;i<nElems;i++)
	    {
		System.out.print(mArrayOrigin[i]+" ");
	    }
	System.out.println(" ");

	System.out.println("Sorted data:");
	for(int i=0;i<nElems;i++)
	    {
		System.out.print(mArray[i]+" ");
	    }
	System.out.println(" ");
    }

    public void reset()
    {
	for(int i=0;i<nElems;i++)
	    {
		mArray[i] = mArrayOrigin[i];
	    }
    }
    
    public void BubbleSort()
    {
	int right,left;
	for(right = nElems-1;right>0;right--)
	    {
		
		for(left=0;left<right;left++)
		    {
			if(mArray[left]>mArray[left+1])
			    swap(left,left+1);
		    }
	    }
	
    }

    
    
    public void SelectSort()
    {
	int left,right;
	int max;

	for(right = nElems-1;right>0;right--)
	    {
		max = right;
		for(left=0;left<right;left++)
		    {
			if(mArray[max]<mArray[left])
			    max = left;
		    }
		if(max != right)
		    swap(max,right);
		
	    }
	
    }

    public void InsertSort()
    {
	int left,right;
	for(right = nElems-1;right>0;right--)
	    {
		int insert_value = right - 1;
		long temp = mArray[insert_value];
		for(left=right;left<nElems;left++)
		    {
			if(temp > mArray[left])
			    mArray[left-1] = mArray[left];
			else
			    {
				mArray[left-1] = temp;
				break;
			    }
		    }
	       
	    }
	
    }

    private void swap(int i,int j)
    {
	long temp = mArray[i];
	mArray[i] = mArray[j];
	mArray[j] = temp;
    }
    
}



class SortCompareApp
{
    public static void main(String args[])
    {
	int SortDataMax = 10;
	
	SortCompare arr = new SortCompare(SortDataMax);

	for(int i=0;i<SortDataMax;i++)
	    {
		arr.insert((long)(Math.random()*10000.0));
	    }
	arr.BubbleSort();
	arr.display();
	arr.reset();
	
	arr.SelectSort();
	arr.display();
	arr.reset();

	arr.InsertSort();
	arr.display();
    }
}

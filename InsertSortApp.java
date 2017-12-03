class InsertSort
{
    long[] mArray;
    int nElems;
    
    public InsertSort(int max)
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
	int j;
	for(j=0;j<nElems;j++)
	    {
		System.out.print(mArray[j] + " ");
	    }
	System.out.println(" ");
    }

    public void sort()
    {
	for(int right=1;right<nElems;right++)
	    {
		long insert_value = mArray[right];
		int left = right;
		while(left>0 && mArray[left-1]>=insert_value)
		    {
			mArray[left] = mArray[left-1];
			    left--;
		    }
		mArray[left] = insert_value;

		
	    }
	
    }
    
    
}

class InsertSortApp
{
    public static void main(String args[])
    {
	InsertSort arr = new InsertSort(10);

	for(int i=0;i<10;i++)
	    {
		arr.insert((long)(Math.random()*100.0));
	    }
	arr.display();
	arr.sort();
	arr.display();
	
    }
}

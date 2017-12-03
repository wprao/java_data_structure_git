class SelectSort
{
    public long[] mArray;
    public int nElems;
    
    public SelectSort(int max)
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
		System.out.print(mArray[i]+"  ");
		
	    }
	System.out.println(" ");
    }


    //O(n^2)
    public void sort()
    {
	int i,j;
	int min;
	for(i=0;i<nElems-1;i++)
	    {
		min = i;
		for(j=i+1;j<nElems;j++)
		    {
			if(mArray[min]>mArray[j])
			    min = j;
		    }
		swap(min,i);
	    }
    }

    private void swap(int i,int j)
    {
	long temp = mArray[i];
	mArray[i] = mArray[j];
	mArray[j] = temp;
    }

    
}



class SelectSortApp
{
    public static void main(String args[])
    {
	SelectSort arr = new SelectSort(10);

	for(int j=0;j<10;j++)
	    {
		arr.insert((long)(Math.random()*1000.0));
	    }

	arr.display();

	arr.sort();

	arr.display();
	
	
    }
}

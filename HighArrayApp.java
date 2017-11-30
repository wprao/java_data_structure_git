//HighArrayApp
//Demostrate array class with high-level interface

class HighArray
{
    private long[] mArray;
    private int nElems;

    public HighArray(int max)
    {
	mArray = new long[max];
	nElems = 0;
    }

    public boolean find(long searchKey)
    {
	int j;
	for(j=0;j<nElems;j++)
	    if(mArray[j] == searchKey)
		break;
	if(j == nElems) return false;
	else return true;
    }

    public int find_half_search(long searchKey)
    {
	int lower_bound,higher_bound;
	lower_bound = 0;
	higher_bound = nElems - 1;

	int current_key;

	while(true)
	    {
		current_key = (lower_bound + higher_bound) / 2;
		if(mArray[current_key] == searchKey)
		    {
			//			System.out.println("find it in " + searchKey);
			return current_key;
		    }
		else if(lower_bound > higher_bound)
		    {
			return -1;       //can't find it;
			//		System.out.println("can't find" + searchKey);
		    }
		else
		    {
			if(mArray[current_key] < searchKey)
			    lower_bound = current_key + 1;//search is beyond current;
			else if(mArray[current_key] > searchKey)
			    higher_bound = current_key - 1;//search is below current;
		    }
	    }
	
	
    }


    public void insert_half_search(long value)   //insert in order
    {
	int j;
	for(j=0;j<nElems;j++)
	    {
		if(mArray[j]> value)
		    break;
	    }
	for(int k=nElems;k>j;k--)
	    {
		mArray[k] = mArray[k-1];
	    }
	mArray[j] = value;
	nElems++;
    }
    
    public void insert(long value)
    {
	mArray[nElems] = value;
	nElems++;
    }

    public boolean delete(long searchKey)
    {
	int j;
	for(j=0;j<nElems;j++)
        {
	    if(mArray[j] == searchKey)
	    {
		break;
	    }
	}
	if(j == nElems) return false;
	else
	    {
		for(int k = j;k<nElems;k++)
		    {
			mArray[k] = mArray[k+1];
		 
		    }
		nElems--;
		return true;
	    }
    }

    public void display()
    {
	for(int j=0;j<nElems;j++)
	    {
		System.out.println(mArray[j]);
	    }
    }
}


class HighArrayApp
{
    public static void main(String[] args)
    {
	int max_size = 200;
	HighArray arr;
	arr = new HighArray(max_size);

	for(int j=0;j<125;j++)
	    arr.insert_half_search((long)(Math.random()*100.0));

	
	arr.display();

	if(arr.find_half_search(1) >= 0)
	    {
		System.out.println("found 1! in " + arr.find_half_search(1));
		//	arr.delete(1);
	    
	    }
	else  System.out.println("can't find it");
	//	arr.display();
    }
}

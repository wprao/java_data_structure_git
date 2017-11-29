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
	    arr.insert((long)(Math.random()*100.0));

	
	arr.display();

	if(arr.find(77))
	    {
		System.out.println("found 77!");
		arr.delete(77);
	    
	    }
	arr.display();
    }
}

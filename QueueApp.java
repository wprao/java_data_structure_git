class QueueX
{
    private long[] mArray;
    private int mFront;
    private int mRear;
    private int mSize;

    public QueueX(int size)
    {
	mArray = new long[size];
	mSize = size;
	mFront = 0;
	mRear = -1;
    }


    public void status()
    {
	System.out.print("mFront = "+mFront+"  mRear = "+mRear);
	System.out.println(" ");
    }
    
    public void insert(long value)
    {
	if(!isFull())
	    {
		mFront++;
		if(mFront>=mSize) mFront = 0;
		mArray[mFront] = value;
	    }
	else System.out.println("Insert error, queue is full.");
	
    }

    public long remove()
    {
	if(!isEmpty())
	    {
		mRear++;
		if(mRear>=mSize)
		    {
			mRear = -1;
			return mArray[mSize];
		
		    }
		else return mArray[mRear];
	    }
	else
	    {
		System.out.println("Remove error, queue is empty");
		return -1;
	    }
    }

    public long peek()
    {
	return mArray[mRear];
    }

    public boolean isFull()
    {
	if(size()==mSize-1) return true;
	else return false;
    }

    public boolean isEmpty()
    {
	if(size()==0) return true;
	else return false;
    }

    public int size()
    {
       	if(mFront - mRear >= 1) return (mFront-mRear-1);
	else return(mFront-mRear-1+mSize);
    }
    
}

class QueueApp
{
    public static void main(String args[])
    {
	QueueX que = new QueueX(10);
	for(int i =0;i<10;i++)
	    {
		long value =(long)(Math.random()*10.0); 
		que.insert(value);
		System.out.println("insert "+value);
		que.status();
	    }
	for(int i=0;i<10;i++)
	    {
		
		System.out.print(que.remove()+" ");
		que.status();
	    }
    }
}

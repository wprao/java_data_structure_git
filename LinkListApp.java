class Link
{
    public long mData;
    public Link mNext;

    public Link(long value,Link next)
    {
	mData = value;
	mNext = next;
    }
    public void display()
    {
	System.out.println(mData);
    }
}


class LinkList
{
    private Link mFirst;
    private Link mLast;
    
    public LinkList()
    {
	mFirst = null;
	mLast = null;
    }

    public boolean isEmpty()
    {
	return (mFirst == null||mLast == null);
    }

    public void insertFirst(long value)
    {
	Link linkInsert = new Link(value,mFirst);
	mFirst = linkInsert;

	if(isEmpty())
	    {
		mLast = mFirst;
	    }
	
    }

    public void insertLast(long value)
    {
	if(!isEmpty())
	    {
		Link linkInsert = new Link(value,null);
		mLast.mNext = linkInsert;
		mLast = linkInsert;
	    }
	else
	    {
		Link linkInsert = new Link(value,null);
		mLast = linkInsert;
		mFirst = linkInsert;
	    }
    }

    public Link deleteFirst()
    {
	Link temp = mFirst;
	mFirst = mFirst.mNext;
	return temp;
    }


    public Link find(long value)
    {
	Link currentLink;
	currentLink = mFirst;
	while(currentLink != null)
	    {
		if(currentLink.mData == value)
		    return currentLink;

		currentLink = currentLink.mNext;
	    }
	return null;
    }

    public boolean delete(long value)
    {
	Link currentLink;
	Link previousLink;
	currentLink = mFirst;
	previousLink = currentLink;
	while(currentLink != null)
	    {
		if(currentLink.mData == value)
		    {
			if(currentLink != mFirst)
			    {
				previousLink.mNext = currentLink.mNext;
				currentLink = null;
				System.out.println("found!!"+value);
				return true;
			    }
			else
			    {
				mFirst = mFirst.mNext;
				return true;
			    }
		    }
		previousLink = currentLink;
		currentLink = currentLink.mNext;
	    }
	return false;
    }
    
    public void display()
    {
	System.out.println("Link from first to last:");
	Link currentLink = mFirst;
	while(currentLink != null)
	    {
		currentLink.display();
		currentLink = currentLink.mNext;
	    }
    }
}

class LinkListApp
{
    public static void main(String args[])
    {
	LinkList lnk = new LinkList();
	for(int i = 0;i<10;i++)
	    {
		lnk.insertLast((long)(i));
	    }
	lnk.display();
	lnk.find(1).display();
	lnk.delete(7);
	lnk.display();
	lnk.delete(9);
	lnk.display();
	for(int i = 0;i<10;i++)
	    {
		lnk.insertFirst((long)(i));
	    }
	lnk.display();
	
    }
    
}
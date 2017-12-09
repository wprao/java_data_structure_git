class Link
{
    private long mData;
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

    public LinkList()
    {
	mFirst = null;
    }

    public boolean isEmpty()
    {
	return (mFirst == null);
    }

    public void insert(long value)
    {
	Link linkInsert = new Link(value,mFirst);
	mFirst = linkInsert;
    }
    public Link deleteFirst()
    {
	Link temp = mFirst;
	mFirst = mFirst.mNext;
	return temp;
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
		lnk.insert((long)(Math.random()*1000.0));
	    }
	lnk.display();
	
    }
    
}

class StackX
{
    private long[] mStack;
    private int top;
    private int mSize;
    
    public StackX(int size)
    {
	mStack = new long[size];
	mSize = size;
	top = -1;
    }

    public boolean push(long value)
    {
	if(!isFull()) //if stack is not full
	    {
		mStack[++top] = value;
		return true;
	    }
	else return false;
    }

    public long pop()
    {
	if(!isEmpty())  //if stack is not empty
	    {
		return mStack[top--];
	    }
	else return -1;
    }

    public long peek()
    {
	if(!isEmpty()) //if stack is not empty
	    {
		return mStack[top];
	    }
	else return -1;
   	
    }

    public boolean isEmpty()
    {
	return (top==-1?true:false);
    }

    public boolean isFull()
    {
	if(top>=mSize-1)
	    return true;
	else return false;
    }
}


class Reverse
{
    private String mInput;
    private String mOutput;

    public Reverse(String value)
    {
	mInput = value;
	mOutput = "";
    }

    public String ReverseString()
    {
	StackX stk = new StackX(mInput.length());

	
	for(int i=0;i<mInput.length();i++)
	    {
		stk.push((long)mInput.charAt(i));
	    }

	for(int i=0;i<mInput.length();i++)
	    {
		char ch = (char)stk.pop();
		mOutput += ch; 
	    }
	return mOutput;
	
    }
    
}


class StackApp
{
    public static void main(String args[])
    {
	StackX stk = new StackX(10);
	int i;
	for(i = 0;i<10;i++)
	    {
		stk.push((long)(Math.random()*100.0));

	    }
	for(i=0;i<10;i++)
	    {
		System.out.print(stk.pop()+" ");
	    }
	System.out.println(" ");


	Reverse rev = new Reverse("Hello,World!Java Data Structure & Algorithm");
	System.out.println("Hello,World!Java Data Structure & Algorithm");
	System.out.println(rev.ReverseString());
	
    }
}

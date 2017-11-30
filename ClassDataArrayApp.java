class Person
{
    public String mLastName;
    public String mFirstName;
    public int mAge;

    public Person(String lastName,String firstName,int age)
    {
	mLastName = lastName;
	mFirstName = firstName;
	mAge = age;
    }

    public void DisplayPerson()
    {
	System.out.println("Firstname is "+mFirstName);
	System.out.println("Lastname is "+mLastName);
	System.out.println("Age is "+mAge);
    }

    public String GetLastName()
    {
	return mLastName;
    }
    
}


class ClassDataArray
{
    private Person[] mArray;
    private int nElems;

    public ClassDataArray(int max)
    {
	mArray = new Person[max];
	nElems = 0;
    }

    public void display()
    {
	for(int i=0;i<nElems;i++)
	    {
		mArray[i].DisplayPerson();
	    }
    }
    

    public Person find(String searchName)
    {
	int j;
	for(j=0;j<nElems;j++)
	    {
		if(mArray[j].mFirstName == searchName)
		    break;
	    }
	if(j == nElems) return null;
	else return mArray[j];
    }

    public boolean insert(String firstName,String lastName,int age)
    {
	mArray[nElems] = new Person(firstName,lastName,age);
	nElems++;
	return true;
    }

    public boolean delete(String searchName)
    {
	int j;
	for(j=0;j<nElems;j++)
	    {
		if(mArray[j].mFirstName == searchName)
		    break;
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
}


class ClassDataArrayApp
{
    public static void main(String[] args)
    {
	ClassDataArray arr;
	arr = new ClassDataArray(10);

	arr.insert("Obama","Stick",19);
	arr.display();

	Person per = arr.find("Obama");
	if(per != null)
	    per.DisplayPerson();
	else System.out.println("can't find it");
    }
}

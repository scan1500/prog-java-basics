
public class Collection
{
	IntegerCell[] iCell;

	public Collection(int n)
	{
		iCell = new IntegerCell[30];
	}

	public void insert(IntegerCell aCell)
	{
		for (int i = 0; i < iCell.length; i++)
			if (iCell[i] == null)
				iCell[i] = aCell;
	}

	public void remove(IntegerCell aCell)
	{
		for(int i=0; i<iCell.length;i++)
			if(iCell[i].getNumber() == aCell.getNumber())
				iCell[i] = null;
	}

	boolean isEmpty()
	{
		for (int i = 0; i < iCell.length; i++)
			if (iCell[i] != null)
				return false;
		return true;
	}
}

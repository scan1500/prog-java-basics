
public class IntegerCell
{
	private int number;

	public IntegerCell()
	{
		number = 1; // default value
	}

	public IntegerCell(int i)
	{
		number = i;
	}

	public IntegerCell add(IntegerCell i)
	{
		return new IntegerCell(number + i.number);
	}

	public IntegerCell subtract(IntegerCell i)
	{
		return new IntegerCell(number - i.number);
	}

	public IntegerCell multiply(IntegerCell i)
	{
		return new IntegerCell(number * i.number);
	}

	public IntegerCell divide(IntegerCell i)
	{
		return new IntegerCell(number / i.number);
	}

	public int getNumber()
	{
		return number;
	}

	@Override
	public String toString()
	{
		return "[" + number + "]";
	}

}
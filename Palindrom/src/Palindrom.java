import java.util.Stack;

public class Palindrom
{	
	Stack<Character> stack = new Stack();

	public boolean palTest(String name)
	{
		System.out.println("Das Wort: " + name + " wird getestet...");
		
		name = name.toLowerCase();
		char[]chars = name.toCharArray();
		
		for(int i=0; i<chars.length; i++)
		{
			stack.push(chars[i]);
		}
		
		
		for(int i=0;i<chars.length;i++)
		{
			if(chars[i] != stack.pop())
			{
				System.out.println("Das Wort: " + name + " ist kein Palindrom!");
				return false;
			}
		}
		System.out.println("Das Wort: " + name + " ist ein Palindrom!");
		return true;

	}
}

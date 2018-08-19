
public class Bloecke 
{
	public static void main(String[] Args)
	{ 	//Block A
		int x=5, y=5;
		
		{ 	//BLOCK B
			
			int f=7, g=7;
			x=20;
			
			{ 	//BLOCK C
				
				int z=9, h=9;
				y=3000;
			}
		}//h wird ab hier wieder frei geg.
		
		//h = 5.0f;
		//z=4.0f
	}
		
		
}

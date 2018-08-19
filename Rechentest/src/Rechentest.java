import java.util.Scanner;

public class Rechentest 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		
		while(true)
		{
			int iRechenart = (int)(Math.random()*4);
			int iZahl1 = (int)(Math.random()*33);
			int iZahl2 = (int)(Math.random()*33);
			boolean bRichtig = false;
			
			if((iZahl2 == 0) || (iZahl1%iZahl2 != 0 & iRechenart == 3))
				continue;
			
			switch(iRechenart)
			{
				case 0: 
					while(bRichtig == false)
					{
							System.out.println(iZahl1+" + "+iZahl2+" = ?");
							if(sc.nextInt() == iZahl1+iZahl2)
							{
								System.out.println("Richtig!");
								bRichtig = true;
							}
							else
							{
								System.out.println("Falsch!");
							}
					}
				break;
				
				case 1:
					while(bRichtig == false)
					{
							System.out.println(iZahl1+" - "+iZahl2+" = ?");
							if(sc.nextInt() == iZahl1-iZahl2)
							{
								System.out.println("Richtig!");
								bRichtig = true;
							}
							else
							{
								System.out.println("Falsch!");
							}
					}
					break;
				case 2:
					while(bRichtig == false)
					{
							System.out.println(iZahl1+" * "+iZahl2+" = ?");
							if(sc.nextInt() == iZahl1*iZahl2)
							{
								System.out.println("Richtig!");
								bRichtig = true;
							}
							else
							{
								System.out.println("Falsch!");
							}
					}
					break;
				case 3:
					while(bRichtig == false)
					{
							System.out.println(iZahl1+" / "+iZahl2+" = ?");
							if(sc.nextDouble() == iZahl1/(double)iZahl2)
							{
								System.out.println("Richtig!");
								bRichtig = true;
							}
							else
							{
								System.out.println("Falsch!");
							}
					}
					break;
			}
			}
		}
		
	}


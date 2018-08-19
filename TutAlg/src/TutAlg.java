import java.util.Scanner;

public class TutAlg 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		// Teil 1: Punktedurchschnitt von genau 10 Studenten:
		
		/*
		int iPunkte=0, iSumme=0;
		
		for(int i=0; i<10; i++)
		{
			System.out.println((i+1)+". Bitte Punkte eingeben: ");
			iPunkte = sc.nextInt();
			iSumme = iSumme + iPunkte;
		}
		
		System.out.println("Durchschnitt:" + (iSumme/10.));
		*/
		
		
		// Teil 2: Punktedurchschnitt von n Studenten:
	
		/*
		int iPunkte=0, iSumme=0;
		
		for(int i=0; true; i++)
		{
			System.out.println((i+1)+". Bitte Punkte eingeben: (-1 abbrechen)");
			iPunkte = sc.nextInt();
			
			if(iPunkte != -1)
			{
				iSumme = iSumme + iPunkte;
			}
			else
			{
				System.out.println("Durchschnitt:" + (iSumme/(double)i));
				break;
			}
		}
		*/
		
		// Teil 3: Notendurchschnitt von n Studenten:
		
		/*
		int iPunkte=0, iSumme=0, iNote=0;
		
		for(int i=0; true; i++)
		{
			System.out.println((i+1)+". Bitte Punkte eingeben: (-1 abbrechen)");
			iPunkte = sc.nextInt();
			
			if(iPunkte>=95)
				iNote = 15;
			else if(iPunkte >= 92)
				iNote = 14;
			else if(iPunkte >= 88)
				iNote = 13;
			else if(iPunkte >= 82)
				iNote = 12;
			else if(iPunkte >= 78)
				iNote = 11;
			else if(iPunkte >= 72)
				iNote = 10;
			else if(iPunkte >= 68)
				iNote = 9;
			else if(iPunkte >= 60)
				iNote = 8;
			else if(iPunkte >= 50)
				iNote = 7;
			else if(iPunkte >= 45)
				iNote = 6;
			else if(iPunkte >= 40)
				iNote = 5;
			else if(iPunkte >= 35)
				iNote = 4;
			else if(iPunkte >= 30)
				iNote = 3;
			else if(iPunkte >= 25)
				iNote = 2;
			else if(iPunkte >= 20)
				iNote = 1;
		
				
			if(iPunkte != -1)
			{
				System.out.println("Note: "+iNote);
				iSumme = iSumme + iNote;
			}
			else
			{
				double dDurchschnitt = (iSumme/(double)i);
				System.out.println("Durchschnitt:" + dDurchschnitt);
							
				break;
			}
		}
		*/
		
		// Teil 4: Notendurchschnitt mit Feedback
		
		int iPunkte=0, iSumme=0, iNote=0;
		
		for(int i=0; true; i++)
		{
			System.out.println((i+1)+". Bitte Punkte eingeben: (-1 abbrechen)");
			iPunkte = sc.nextInt();
			
			if(iPunkte>=95 & iPunkte<=100)
			{
				iNote = 15;
				System.out.println("Sehr gut!");
			}
			else if(iPunkte >= 92 & iPunkte<=100)
			{
				iNote = 14;
				System.out.println("Sehr gut!");
			}
			else if(iPunkte >= 88 & iPunkte<=100)
			{
				iNote = 13;
				System.out.println("Sehr gut!");
			}
			else if(iPunkte >= 82 & iPunkte<=100)
			{
				iNote = 12;
				System.out.println("Gut!");
			}
			else if(iPunkte >= 78 & iPunkte<=100)
			{
				iNote = 11;
				System.out.println("Gut!");
			}
			else if(iPunkte >= 72 & iPunkte<=100)
			{
				iNote = 10;
				System.out.println("Gut!");
			}
			else if(iPunkte >= 68 & iPunkte<=100)
			{
				iNote = 9;
				System.out.println("Befriedigend!");
			}
			else if(iPunkte >= 60 & iPunkte<=100)
			{
				iNote = 8;
				System.out.println("Befriedigend!");
			}
			else if(iPunkte >= 50 & iPunkte<=100)
			{
				iNote = 7;
				System.out.println("Befriedigend!");
			}
			else if(iPunkte >= 45 & iPunkte<=100)
			{
				iNote = 6;
				System.out.println("Ausreichend!");
			}
			else if(iPunkte >= 40 & iPunkte<=100)
			{
				iNote = 5;
				System.out.println("Ausreichend!");
			}
			else if(iPunkte >= 35 & iPunkte<=100)
			{
				iNote = 4;
				System.out.println("Ausreichend!");
			}
			else if(iPunkte >= 30 & iPunkte<=100)
			{
				iNote = 3;
				System.out.println("Mangelhaft!");
			}
			else if(iPunkte >= 25 & iPunkte<=100)
			{
				iNote = 2;
				System.out.println("Mangelhaft!");
			}
			else if(iPunkte >= 20 & iPunkte<=100)
			{
				iNote = 1;
				System.out.println("Mangelhaft!");
			}
			else if(iPunkte >= 0 & iPunkte<=100)
			{
				iNote = 0;
				System.out.println("Ungenügend!");
			}
			else if(iPunkte == -1)
			{
				System.out.println("Abbruch!");
			}
			else
			{
				System.out.println("Falsche Eingabe!");
				System.out.println(i);
				i--;
				continue;
			}
		
				
			if(iPunkte != -1)
			{
				System.out.println("Note: "+iNote);
				iSumme = iSumme + iNote;
			}
			else
			{
				double dDurchschnitt = (iSumme/(double)i);
				System.out.println("Durchschnitt:" + dDurchschnitt);
							
				break;
			}
		}
		
	}
	
}

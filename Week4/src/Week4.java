import java.util.Scanner;

public class Week4 {

	public static int temp = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first = sc.next();
		String last = sc.next();
		
		String specialCharacters=" !#$%&'()*+,-./:;<=>?@[]^_`{|}~0123456789";
		String str1[]=first.split("");
		String str2[]=last.split("");	
		
		
//		if(first.isEmpty())
//		{
//			System.out.println("Enter first name!");
//		}
//		else if(last.isEmpty())
//		{
//			System.out.println("Enter last name!");
//		}
		
			
		    for (int i=0;i<str1.length;i++)
		    {
			    if (specialCharacters.contains(str1[i]))
			    {
			        System.out.println("No special characters in first name");
			       // System.out.println("1"+temp);
			        temp = 0;
			        break;
			    }			   
			    else
			    {
			    	temp = 1;
			    	//System.out.println("2"+temp);
			    }
			}
		    for (int i=0;i<str2.length;i++)
		    {
			    if (specialCharacters.contains(str2[i]))
			    {
			        System.out.println("No special characters in last name");
			        //System.out.println("3"+temp);
			        temp = 0;
			        break;
			    }		
			    else
			    	{temp = 1;
			    //System.out.println("4"+temp);
			    	}
			}
		if(temp == 1)
		{
			System.out.println(first+" "+last);
		}
		else if(temp ==0)
		{
			System.out.println("haww");
		}
		sc.close();
	}

}

package Testing;

public class DetectPalindrome {

	public DetectPalindrome() {
		// TODO Auto-generated constructor stub

	}
	
	public boolean detect(String s)
	{
		if (s == null) 
		{ 
			System.out.println("Yo My Man, your imput is NULL!");
			return false; 
		}
		
		int len = s.length();
		int last = len-1;
		int first = 0;
		
		for (int i=0;i<len;i++)
		{	
			if (last <= first) { return true; }
			if (s.charAt(first) != s.charAt(last))
			{
				return false;
			}
			last--;
			first++;
		}
		return true;
	}
	
	public boolean detectNoCase(String s) 
	{
		try
		{ 
		
			int len = s.length();
			int last = len-1;
			int first = 0;
			
			
			
			for (int i=0;i<len;i++)
			{	
				if (last <= first) { return true; }
				if (Character.toLowerCase(s.charAt(first)) != Character.toLowerCase(s.charAt(last)))
				{
					return false;
				}
				last--;
				first++;
			}
		
		}
		catch (Exception e)
		{
			System.out.println("Houston, we have a problem");
			e.printStackTrace();
		}
		
		return true;
	}

}
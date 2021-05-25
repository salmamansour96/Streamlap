package streamlap;
public class Alpha {
	
	public static boolean isalpha(String s)
	{
		
		return ((s!=null)&& (s!="")&&(s.chars().allMatch(Character::isLetter)));
	}

}

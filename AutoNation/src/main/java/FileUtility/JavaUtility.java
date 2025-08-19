package FileUtility;

import java.util.Random;

public class JavaUtility {
	public int getRandomNumber(int no)
	{	
		Random random= new Random();
		int randomNumber = random.nextInt(no);
		return randomNumber;
	}
	
	  public char getRandomLetters(){
	        Random random = new Random(); 
	        char randomChar = (char) ('A' + random.nextInt(26));
			return randomChar;
	    }
	

}

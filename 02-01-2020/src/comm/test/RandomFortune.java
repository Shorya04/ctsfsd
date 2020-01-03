package comm.test;
import java.util.Random;

public class RandomFortune {
	
	public void selectRandom() {
	
	String[] str=new String[5];
	{
	str[0]="Be Kind.";
	str[1]="Be Positive.";
	str[2]="Be limitless.";
	str[3]="Keep Working Hard.";
	str[4]="Spread Love & Peace";
	}
	Random r=new Random();
	int randomNumber=r.nextInt(str.length);
	System.out.println(str[randomNumber]);
	}
	
	
}
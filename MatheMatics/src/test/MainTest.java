/**
 * 
 */
package test;

import com.maths.formula.Statistics;

/**
 * @author sandeep
 *
 */
public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbersInt[]={600 , 470 , 170 , 430 ,300};
		float numbersFloat[]={600.03f , 470.55f , 170.65f , 430.99f ,300.5656f};
		double numbersDouble[]={600 , 470 , 170 , 430 ,300};
		Statistics s=new Statistics();
		System.out.println("Int :"+s.standardDeviation(numbersInt));
		System.out.println("Float :"+s.standardDeviation(numbersFloat));
		System.out.println("Double :"+s.standardDeviation(numbersDouble));
	}

}

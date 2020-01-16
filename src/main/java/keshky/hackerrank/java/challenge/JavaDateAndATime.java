/*
 * https://www.hackerrank.com/challenges/java-date-and-time/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 * */
package keshky.hackerrank.java.challenge;
 
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaDateAndATime {

	static class Result {

	    /*
	     * Complete the 'findDay' function below.
	     *
	     * The function is expected to return a STRING.
	     * The function accepts following parameters:
	     *  1. INTEGER month
	     *  2. INTEGER day
	     *  3. INTEGER year
	     */

	    public static String findDay(int month, int day, int year) {
	    	
	    	Calendar calendar = new GregorianCalendar(year,month-1,day);
	    	int dayOfWeek = calendar.get(calendar.DAY_OF_WEEK);
	    	switch (dayOfWeek) {
	    	case 1:
				return "SUNDAY";
	    	case 2:
				return "MONDAY";
	    	case 3:
				return "TUESDAY";
	    	case 4:
				return "WEDNESDAY";
	    	case 5:
				return "THURSDAY";
	    	case 6:
				return "FRIDAY";
	    	case 7:
				return "SATURDAY";
				
			default:
				break;
			}
			return null;

	    }

	}
	
	public static void main(String[] args) throws IOException{
    	
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

	}

}

package com.example.project;
import java.util.*;

public class CalendarTester {


    public static void main(String[] args) {


        //This constructs a GregorianCalendar object
        GregorianCalendar myCal = new GregorianCalendar();

        int dayOfMonth = myCal.get(Calendar.MONTH);
        System.out.println("myCal Day of Month: " + dayOfMonth);
        System.out.println("Expected: 23");

        int month = myCal.get(Calendar.MONTH) +1;
        System.out.println("MyCal Month: " +month);
        System.out.println("Expected: 9");

        int year = myCal.get(Calendar.YEAR);
        System.out.println("MyCal Year:" + year);
        System.out.println("Expected: 2020");

        int weekday = myCal.get(Calendar.DAY_OF_WEEK);
        System.out.println("myCal Day of Week: " + weekday);
        System.out.println("Expected: 5");


        /* You can use constants with the GregorianCalendar class to refer to its various
         * variables.  For example, "Calendar.MONTH" is a variable that refers to the
         * month of the calendar.  This can be used with the .get() method to test
         * the calendar.  Consider the example:
         * */

        //Call the .get method on myCal using Calendar.DAY_OF_WEEK as the argument

        System.out.println("myCal Day of Week: " + myCal.get(Calendar.DAY_OF_WEEK));
        System.out.println("Expected: 5");     //Note: 1 = Sunday, 2 = Monday, etc.

        System.out.println("Today's date is:" + month + "/" + dayOfMonth + "/" +year);



        //Write similar tests for month, year and day of month.


        //Call the .add method to add 100 days to myCal.  Then, check the date and weekday of this new date.
        // To see that it is correct, check out this calendar calculator:
        //http://www.timeanddate.com/date/dateadd.html

        myCal.add(Calendar.DAY_OF_YEAR, 100);
        int weekday2 = myCal.get(Calendar.DAY_OF_WEEK);
        int month2 = myCal.get(Calendar.MONTH) +1;
        int dayOfMonth2 = myCal.get(Calendar.DAY_OF_MONTH);
        int year2 = myCal.get(Calendar.YEAR);
        System.out.println("100 years from today, the date will be:" + month2 + "/" + dayOfMonth2 + "/" + year2);



        //Finally, find what day of the week is 10,000 days after your 2020 birthday. Note, you may have to play around
        //with adding or subtracting days to get to your birthday date (hmm, how can you subtract days?)

        myCal.add(Calendar.DAY_OF_MONTH, -6004);
        System.out.println("The weekday of my birthday is a " +myCal.get(Calendar.DAY_OF_MONTH));
        System.out.println("My Birthday is: " + myCal.get(Calendar.MONTH) + "/" + myCal.get(Calendar.DAY_OF_MONTH) + "/" + myCal.get(Calendar.YEAR));

        myCal.add(Calendar.DAY_OF_MONTH, 10000);
        System.out.println("10000 days after my birthday, the date is: " + myCal.get(Calendar.MONTH) + "/" + myCal.get(Calendar.DAY_OF_MONTH) + "/" + myCal.get(Calendar.YEAR));




    }

}
public class minutesToYears {

    public static void printYearsAndDays(long minutes){

        if (minutes < 0 ){

            System.out.println("Invalid Value");

        } else {

            long year = minutes / 525600;
            long day = minutes / 1440;
            long remainingDays = day % 365;


            System.out.println(minutes + " min" + " = " + year + " y " + "and " + remainingDays + " d");

        }
    }
}

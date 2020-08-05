public class karakadetome {


        public static void main(String[] args) {



       /* String name = "Joisp";
        int age = 39;
        float annualPay = (float)12.556;
        System.out.print("My name is " + name + " and I make :" + annualPay + " dollars a year. \nMy age is :" + age);
        */

      /* String firstName = "Josip";
       String lastNmae = "Srander";
       String middleName = "Goram";
       char fInit = 'J';
       char lInit = 'S';
       char mInit = 'G';
       System.out.print(firstName + " inital is "+ fInit + "\n" +lastNmae + " inital is " +
                lInit + "\n" + middleName + " inital is " + mInit);*/

        /*System.out.println("     *    ");
        System.out.println("    ***    ");
        System.out.println("   *****    ");
        System.out.println("  ******* ");
        System.out.println("   *****   ");
        System.out.println("    ***    ");
        System.out.println("     *    ");*/

       /* double salesYear = 4600000;
        double percentageYear = 0.62;
        double totalIncome = salesYear*percentageYear;
        System.out.print(totalIncome);
*/

        /*
       final double ONE_ACRE_OF_LAND = 43.560;//feet
        double land = 389.767;//feet
        double numOfFeet = (land / ONE_ACRE_OF_LAND) * 1;
        System.out.print((float)numOfFeet + " acers");
        */

        /*double amountOfPurchase;
        double ststeTax = 0.04;
        double countyTax = 0.02;
        double cTax;
        double sTax;
        double totalTax;
        double totalSale;

        Scanner input = new Scanner(System.in);
        System.out.println("Amount of purchase ");
        amountOfPurchase = input.nextDouble();

        cTax = countyTax * amountOfPurchase;
        sTax = ststeTax * amountOfPurchase;
        totalTax = sTax + cTax;
        totalSale = amountOfPurchase + totalTax;
        System.out.println("Amount of purchase " + amountOfPurchase + "\n" +
                "State sales tax " + ststeTax + "\n" + "State county tax " + countyTax +
                 "\n" + "Total sales tax " + totalTax + "\n" + "Total of sale " +
                totalSale);*/


       /* float numOfServings;
        float numOfCookiesEaten;
        float totalCalConsumed;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter num of cookiers eaten :");
        numOfCookiesEaten = input.nextFloat();

        numOfServings = (numOfCookiesEaten / 40) * 10;
        totalCalConsumed = (numOfServings / 1) * 300;
        System.out.println("Number of calories consumed " + totalCalConsumed +
                "\nNumber of servings " + numOfServings);*/

       /* int customesrTotal = 12467;
        double purchasePercent = 0.14;
        double citrusFlavCustPercent = 0.64;
        double purchaCustPerWeek = customesrTotal * purchasePercent;
        double citrusDrinkBuy =  purchaCustPerWeek * citrusFlavCustPercent;;

        System.out.println("Num of customers that are buying drinks: " + (int)purchaCustPerWeek +
                "\nCitrus flavor buying customers: " + (int)citrusDrinkBuy);*/

        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter num of cookies to make:");
        int numOfCookies = input.nextInt();
        double cupsOfSuggar = 1.5;
        double  cupOfBitter = 1;
        double cupsOfFlour = 2.75;
        int regBatchOfCookies = 48;
        double expecteedCupsSuggar;
        double expecteedCupsButter;
        double expecteedCupsFlour;

        expecteedCupsSuggar = (numOfCookies / regBatchOfCookies) * cupsOfSuggar;
        expecteedCupsButter = (numOfCookies / regBatchOfCookies) * cupOfBitter;
        expecteedCupsFlour = (numOfCookies / regBatchOfCookies) * cupsOfFlour;
        System.out.println("For " + numOfCookies + " cookies you will need: " + expecteedCupsSuggar +
                ", cups of sugar :" + expecteedCupsButter + ", cups of butter : " + expecteedCupsFlour +
                " cups of flour");*/

        /*int numOfShares = 1000;
        double pricePaidPerStock = 32.87;
        double stBrComission = 0.02;
        int numOfStSold = 1000;
        double priceForSoldSt = 33.92;
        double saleStBrCommision = 0.02;

        double amountPaid = numOfShares * pricePaidPerStock;
        double amountComPaidBroker = amountPaid * stBrComission;
        double amountOfSoldStock = numOfStSold * priceForSoldSt;
        double amountCommPaidbroker2 = amountOfSoldStock * saleStBrCommision;
        double moneyMaid = amountOfSoldStock - amountPaid;
        double comPaid = amountCommPaidbroker2 + amountComPaidBroker;
        double totalProfit = moneyMaid + comPaid;
        double totalProfitAll = totalProfit - comPaid;
        System.out.println("Total profit : " + totalProfit + " total profit after all = " + totalProfitAll);
        */

        /*Scanner input = new Scanner(System.in);
        System.out.println("Input numeral:");
        int numnber = input.nextInt();

        switch (numnber) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("x");
                break;
            default:
                System.out.println("Wrong number entered");

        }
        */

        /*Scanner input = new Scanner(System.in);
        System.out.println("Input first score: ");
        int firstScore = input.nextInt();
        System.out.println("Input second score: ");
        int secondScore = input.nextInt();
        System.out.println("Input third score: ");
        int thirdScore = input.nextInt();

        float average = (firstScore +secondScore + thirdScore) / 3;
        System.out.println("Average points :" + average);
        if (average >= 90 && average <= 100) {
            System.out.println("Grade is A");
        }else if (average >= 80 && average <= 90){
            System.out.println("Grade is B");
        }else if (average >= 70 && average <= 80){
            System.out.println("Grade is C");
        }else if (average >= 60 && average <= 70){
            System.out.println("Grade is D");
        }else if (average >= 50 && average <= 60){
            System.out.println("Grade is F");
        }else{
            System.out.println("Grade not valid");
        }*/

      /*
       Scanner input = new Scanner(System.in);
        System.out.println("Enter masss");
        double mass = input.nextDouble();
        double weight;
        weight = mass * 9.8;
        if(mass >= 1000){
            System.out.println("You are to heavy");
        }else if(mass <= 10){
            System.out.println("You are to light");
        }
        System.out.println("The mass of objecz in kg is it weight in : " + weight + " Newtons");
        */


        /*int secInMin = 60;
        int secInHour = 3600;
        int secINDay = 86400;
        double userSeconds;
        double days = 0;
        double minutes;
        double seconds;
        double remainigSeconds =0;
        double hours = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num of seconds");
        userSeconds = input.nextDouble();
        if(userSeconds >= secINDay ){
           days =  userSeconds / secINDay;
           remainigSeconds = userSeconds % secINDay;
           if(remainigSeconds >= secInHour){
               hours = remainigSeconds / secInHour;
               remainigSeconds = remainigSeconds % secInHour;
           }

        }
        System.out.println("Days " + (int)days + " hours " + hours + " remanins seconds " + remainigSeconds);

*/


       /* Scanner input = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = input.nextLine();
        System.out.println("Input name1: ");
        String name1 = input.nextLine();
        System.out.println("Input name2: ");
        String name2 = input.nextLine();
        String output = "";
        if(name.compareToIgnoreCase( name1) < 0 && name1.compareToIgnoreCase(name2) < 0){
            output += name;
            if (name1.compareToIgnoreCase(name2) < 0 ){
                output += name1;
            }else{
                output += name2;
                output += name1;
            }
        }
        System.out.println(output);

*/

      /*  Scanner input = new Scanner(System.in);
        double x = 1024.00;
        System.out.println("Upisite vrijednost: ");
        double kb = input.nextDouble();
        System.out.println("kilobyta = : " + kb/x);
*/


      /* Random random = new Random();
        int ukupniBrojBacanja = 10;
        int compjuterskoBacanje = 0;
        int bacanjeIgraca;
        int compjutersiRezultat = 0;
        int rezultatIgraca = 0;

        for (int bacanje = 1; bacanje <= ukupniBrojBacanja; bacanje++){
           compjuterskoBacanje =  random.nextInt(6) + 1;
            bacanjeIgraca = random.nextInt( 6 ) + 1;

            if (compjuterskoBacanje > bacanjeIgraca){
                compjutersiRezultat = compjutersiRezultat + 1;
                System.out.println("Kompjuter dobio, bacanja " + bacanje);
            }else if (bacanjeIgraca > compjuterskoBacanje) {
                System.out.println("Igrac dobio bacanja " + bacanje);
                rezultatIgraca = rezultatIgraca + 1;

            }else{
                System.out.println("Bacanje " + bacanje + " neodluceno");
            }

        }

        if(compjutersiRezultat > rezultatIgraca){
            System.out.println("Kompjuter pobijedio " + compjutersiRezultat + " od totoalnog bacanja " +
                    ukupniBrojBacanja + " bacanja" );
        }else if(compjutersiRezultat == rezultatIgraca){
            System.out.println("Neodluceno sa kompjuterom je rezultat " + compjutersiRezultat + " bacanja i igrac pobjedjuje " +
                    rezultatIgraca + " od svih bacanja " + ukupniBrojBacanja);
        }*/



       /* Scanner input = new Scanner(System.in);
        System.out.println("Num of checks written:");
        int bankCharge = 10;
        float checkFees1 = (float).10;
        float checkFees2 = (float).08;
        float checkFees3 = (float).06;
        float checkFees4 = (float).04;
        float totalCharge = 0;
        int inputChecksNum = input.nextInt();

        if(inputChecksNum  < 20){
           totalCharge= bankCharge + (inputChecksNum * checkFees1);
        }else if (inputChecksNum < 40){
            totalCharge= bankCharge + (inputChecksNum * checkFees2);
        }else if (inputChecksNum < 60){
            totalCharge= bankCharge + (inputChecksNum * checkFees3);
        }else{
            totalCharge= bankCharge + (inputChecksNum * checkFees4);
        }
        System.out.println("Total usere num of checks is :" + inputChecksNum + " and the bank charce is : " +
                totalCharge + "$.");*/


       /* Scanner input = new Scanner(System.in);
        int number = -1;
        double total = 0;

        while (number < 1) {
            System.out.print("Input number greater then 0");
            number = input.nextInt();
        }
            for (int i = 1; i <= number;i++){
                total= total + number;
            }


        System.out.print("Sum of numbers entered " + number + " is "+ total);

*/

        /*PrintWriter distanceTraveledFile = new PrintWriter("distanceTraveledFile.txt");
        Scanner input = new Scanner(System.in);
        double speedOfVehicle = -1;
        int hoursTraveled = 0;
        double distanceTraveled;

        while (speedOfVehicle < 0){
            System.out.println("Please enter speed of vehicle ");
            speedOfVehicle = input.nextDouble();
        }

        while (hoursTraveled < 1){
            System.out.println("Please enter number of hours traveled ");
            hoursTraveled = input.nextInt();

        }

        distanceTraveledFile.println("Hour\\tDistance Travelled\\n----\\t----------");
        //System.out.println("Hour\tDistance Travelled\n----\t----------");
       for (int hour = 1; hour <= hoursTraveled; hour++){
           distanceTraveled = (hour * speedOfVehicle);
           distanceTraveled.println(hour + "\t    " + distanceTraveled);
         // System.out.println(hour + "\t    " + distanceTraveled);
       }
       distanceTraveledFile.close();*/

        /*Scanner input = new Scanner(System.in);

        int daysWorked = 0;
        int pennyForDay = 1;
        double totalPayment = 0;
        final int PENNIES_IN_A_DOLLAR = 100;
        double totalSalary = 0;

        while (daysWorked < 1){
            System.out.println("Enter days worked");
            daysWorked = input.nextInt();

        }

        System.out.println("Day\tPennies For a day\n----\t----------\n");
        for (int day = 1; day <= daysWorked; day++){
            pennyForDay = (int) Math.pow(2,day -1);
            System.out.println(day +"     \t" + pennyForDay);
            totalPayment = totalPayment + pennyForDay;
        }
        totalSalary = totalPayment / PENNIES_IN_A_DOLLAR;
        System.out.println("Total sallary : $ " + totalSalary);*/

        /*Scanner input = new Scanner(System.in);
        double numOfYears = 0;
        int totalNumMonths = 0;
        final int MONTHS_IN_YEAR = 12;
        double inchesRainFall = 0;
        double totalInchesRainFall = 0;
        double averagerainfall;

        while (numOfYears < 1){
            System.out.println("Enter num of years > 1");
            numOfYears = input.nextDouble();
        }

        for (int year = 1; year <= numOfYears; year++){
            for (int month = 1; month <= MONTHS_IN_YEAR; month++){
              while (totalNumOfMonth < 1){
            System.out.println("Enter num of months > 1");
            totalNumOfMonths = input.nextInt();
        }
                System.out.println("Enter num of inches of rain fall for month " + month +
                        ", year " + year);
                inchesRainFall = input.nextDouble();
                totalNumMonths = totalNumMonths +1;
                totalInchesRainFall = totalInchesRainFall + inchesRainFall;

            }
        }
        averagerainfall = totalInchesRainFall / totalNumMonths;
        System.out.println("Average rain fall for total years and  months = " + averagerainfall + " inches");

*/


       /* Scanner input = new Scanner(System.in);

        int integer = 0;
        int max = 0;
        int  min = 0;
        int sentinel = -99;

        while (integer != sentinel){
            if(integer < min){
                min = integer;
            }else if (integer > max){
                max = integer;
            }
            System.out.println("Enter next integer or [-99] to exit");
            integer = input.nextInt();

        }
        System.out.println("The max of integer = " + max + " and the min of integer " + min);
*/

       /*double farentTemp = 0;

       for (int celsiusTemp = 0; celsiusTemp <= 40; celsiusTemp++){
           farentTemp = ((9 / 5) * celsiusTemp) + 32;
           System.out.println("Celsius " + celsiusTemp + " to farentheight = " + farentTemp);
       }*/








        }


    }


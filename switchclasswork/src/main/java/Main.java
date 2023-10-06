public class Main {
    public static void main(String[] args) {

        String status = "New"; // Damaged, Refurbished
        float price = 1.0f;
        double discount = 0.0;

        switch (status){
            case "Damaged":
                discount = .50;
                System.out.println("your price is "+ (price - discount));
            /*
            if the status is Damaged I want you to give them a 50 cents discount
            print out their price after discount
            * */
            case "Refurbished":
                discount = .15;
                System.out.println("your price is "+ (price - discount));

               /*
            if the status is Refurbished I want you to give them a 15 cents discount
            print out their price after discount
            * */
            break;
            default:
                System.out.println("We are sorry no discount for you.");


               /*
            if the status is anything but Damaged or Refurbished I want you to give them a 0 cents discount
            print out - You will be paying full price
            * */

        }
        double discountedPrice = price - (price * discount);
        double roundedDiscountPrice = Math.round(discountedPrice);
        System.out.println("Total after discount: " + roundedDiscountPrice);

//        String dayOfTheWeek;
//
//        int day = 6;
//
//        switch (day) {
//            case 1:
//                dayOfTheWeek = "Monday";
//                System.out.println(dayOfTheWeek + " Buy one get one free");
//                break;
//            case 2:
//                dayOfTheWeek = "Tuesday";
//                System.out.println(dayOfTheWeek + " Any twp for 22cents");
//                break;
//            case 3:
//                dayOfTheWeek = "Wednesday";
//                System.out.println(dayOfTheWeek + " a mental health day off");
//                break;
//
//            case 4:
//                dayOfTheWeek = "Thursday";
//                System.out.println(dayOfTheWeek + " Thirsty Thursdays on Liqs");
//                break;
//            case 5:
//                dayOfTheWeek = "Friday";
//                System.out.println(dayOfTheWeek + " Free fries friday");
//                break;
////            case 6:
////            case 7:
////                dayOfTheWeek = "Saturday";
////
////                System.out.println( "Sorry we are closed on " + dayOfTheWeek);
////                break;
//
//            case 6:
//            case 7:
//                String theDay = (day == 6) ? "Saturday" : "Sunday";
//                dayOfTheWeek = theDay;
//                System.out.println("Sorry we are closed on " + dayOfTheWeek);
//                break;
//
//            default:
//                dayOfTheWeek = "No such day";
//                System.out.println(dayOfTheWeek + " come back tomorrow");
//                break;
//
//        }
    }
}

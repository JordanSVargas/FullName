package cakePackage;

public class TasteTester {
    public static void main(String[] args) {
        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setFlavor("Chocolate and Vanilla");
        birthdayCake.setPrice(250.00);
        birthdayCake.setCandles(29);

        System.out.println("I would like to order a " +birthdayCake.getFlavor()+ " cake with " +birthdayCake.getCandles()+
                 " candles and my budget is " + birthdayCake.getPrice());



        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavor("Red Velvet");
        weddingCake.setPrice(500.00);
        weddingCake.setTiers(6);

        System.out.println("Hello my wedding is coming up and i would like to order a " +weddingCake.getFlavor()+ " cake with " +weddingCake.getTiers()+
                " tiers and my budget is "+weddingCake.getPrice()+ " dollars.");

        Cake cake = new Cake();
        cake.setFlavor("Strawberry");
        cake.setPrice(16.99);

        System.out.println("I love " +cake.getFlavor()+ " cake and at Costco it only costs $" +cake.getPrice());


    }


}

import java.util.Scanner;

public class java2beginner {

    public static void main(String[] args) {




        Scanner input = new Scanner(System.in);
        System.out.println("Enter packages purchased: ");
        int onePackPrice = 99;
        double discount = 0;
        double total = 0;
        double subTotal = 0;

        int numOfPacks = input.nextInt();
        if (numOfPacks < 10 ){
            subTotal = numOfPacks * onePackPrice;
            discount = 0;
            total = subTotal - discount;

        }else if (numOfPacks < 20){
            subTotal = numOfPacks * onePackPrice;
            discount = 0.2 * subTotal;
            total = subTotal - discount;

        }else if (numOfPacks < 50) {
            subTotal = numOfPacks * onePackPrice;
            discount = 0.3 * subTotal;
            total = subTotal - discount;

        }else if (numOfPacks < 100) {
            subTotal = numOfPacks * onePackPrice;
            discount = 0.4 * subTotal;
            total = subTotal - discount;

        }else {
            subTotal = numOfPacks * onePackPrice;
            discount = 0.5 * subTotal;
            total = subTotal - discount;

        }

        System.out.println("Package purchased :" + numOfPacks + ", total purchase price :" + subTotal + " $" +
                ", discount :" + discount + " %"+", total price " + total + " $");





    }

}
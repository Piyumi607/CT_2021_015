package Q05;
import java.util.Scanner;
public class Q05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entree(Enter a num between(1-4)):");
        int entree= scan.nextInt();
        String chooseA;

        System.out.println("Side Dish(Enter a num between(1-4)):");
        int sideDish= scan.nextInt();
        String chooseB;

        System.out.println("Drink(Enter a num between(1-4)):");
        int drink= scan.nextInt();
        String chooseC;

        switch (entree){
            case 1:
                chooseA="Tofu Burger-$3.49";
                break;
            case 2:
                chooseA="Cajun Chicken-$4.59";
                break;
            case 3:
                chooseA="Buffalo Wings-$3.99";
                break;
            case 4:
                chooseA="Rainbow Fillet-$2.99";
                break;
            default:
                chooseA=null;
                break;
        }
        switch (sideDish){
            case 1:
                chooseB="Rice Cracker-$0.79";
                break;
            case 2:
                chooseB="No-Salt Fries-$0.69";
                break;
            case 3:
                chooseB="Zucchini-$1.09";
                break;
            case 4:
                chooseB=" Brown Rice-$0.59";
                break;
            default:
                chooseB=null;
                break;

        }

        switch(drink){
            case 1:
                chooseC="Cafe Mocha-$1.99";
                break;
            case 2:
                chooseC="Cafe Latte-$1.90";
                break;
            case 3:
                chooseC="Espresso-$2.49";
                break;
            case 4:
                chooseC=" Oolong Tea-$0.99";
                break;
            default:
                chooseC=null;
                break;
        }
        System.out.println("Entree:"+chooseA);
        System.out.println("Side Dish :"+chooseB);
        System.out.println("Drink:"+chooseC);

    }
}

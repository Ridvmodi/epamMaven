import Cakes.Blueberry;
import Cakes.Butterscotch;
import Cakes.Strawberry;
import Cakes.cake;
import Chocolates.*;
import Cookies.*;

import java.lang.reflect.Array;
import java.util.*;

public class Customer {
    public static void showMenu(){

        System.out.println("Select items from Chocolates, Cakes and Cookies \n For Chocolates press 1 \n For Cakes press 2 \n For Cookies press 3");
        System.out.println("Press 10 to display chocolates by price low to hight \n Press 11 to display chocolates by calories low to high");
        System.out.println("Press 30 to display cookies by price low to high \n Press 31 to display cookies by calories low to high");
        System.out.println("Press 0 to see the total weight of your bag \n find item within a price range \n Sort the bag items acc to the price");
        System.out.println("Press -1 to exit");
    }
    public static ArrayList<cookies> cookieList(){
        ArrayList<cookies> AllCookies = new ArrayList<>();
        AllCookies.add(new CaramelChip());
        AllCookies.add(new ChocoChip());
        AllCookies.add(new VanillaEssence());
        return AllCookies;
    }
    public static ArrayList<chocolate> chocoList()
    {
        ArrayList<chocolate> AllChocolates = new ArrayList<>();
        AllChocolates.add(new Bournville());
        AllChocolates.add(new DairyMilk());
        AllChocolates.add(new KitKat());
        return AllChocolates;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<chocolate> chocolates = new ArrayList<>();
        ArrayList<chocolate> AllChocolates = chocoList();
        ArrayList<cake> cakes = new ArrayList<>();
        ArrayList<cookies> cookie = new ArrayList<>();
        ArrayList<cookies> AllCookies = cookieList();
        HashMap<String,Double> Weight = new HashMap<>();
        HashMap<String,Double> bag = new HashMap<>();


        System.out.println("Welcome to The Heaven of SWEETS, Choose your favourite items");
        System.out.println("Press 10 to display chocolates by price low to hight \n Press 11 to display chocolates by calories low to high");
        System.out.println("Press 30 to display cookies by price low to high \n Press 31 to display cookies by calories low to high");

       int n;
        do {

            System.out.println("Select Sweets below.");
            System.out.println("Options: - \n 1. Chocolates \n 2. Cakes \n 3. Candies");
            System.out.println("Press 0 to see the total weight of your bag \n find item within a price range \n Sort the bag items acc to the price");
            System.out.println("Press -1 to exit");
            n=sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Pick your Favourite Chocolates");
                    System.out.println("************* Options: \n For Dairy Milk, press D \n For KitKat, press K \n For Bournville, press B *************");
                    char ch = sc.next().charAt(0);
                    chocolate choco;
                    if (ch == 'D' || ch == 'd') {

                        choco = new DairyMilk();
                        if (choco instanceof DairyMilk) {
                            DairyMilk dairy = (DairyMilk) choco;
                            System.out.println("Your selected item's details");
                            System.out.println("************* Dairy Milk: " + "Price :" + dairy.getPrice() + " Weight: " + dairy.getWeight() + " Calories: " + dairy.getCalories() +"*************");
                                chocolates.add(dairy);
                                Weight.put("Dairy Milk", dairy.getWeight());
                                bag.put("Dairy Milk", dairy.getPrice());

                        }
                    }
                   else if (ch == 'K' || ch == 'k') {
                        choco = new KitKat();
                        if (choco instanceof KitKat) {
                            KitKat kitKat = (KitKat) choco;
                            System.out.println("Your selected item's details");
                            System.out.println("************* KitKat: " + "Price :" + kitKat.getPrice() + " Weight: " + kitKat.getWeight() + " Calories: " + kitKat.getCalories()+" *************");



                                chocolates.add(kitKat);
                                Weight.put("KitKat", kitKat.getWeight());
                                bag.put("KitKat", kitKat.getPrice());

                        }
                        }
                    else if (ch == 'B' || ch == 'b') {
                        choco = new Bournville();
                        if (choco instanceof Bournville) {
                          Bournville bournville = (Bournville) choco;
                            System.out.println("Your selected item's details");
                            System.out.println("************* Bournville: " + "Price :" + bournville.getPrice() + " Weight: " + bournville.getWeight() + " Calories: " + bournville.getCalories()+" *************");


                                chocolates.add(bournville);
                                Weight.put("Bournville", bournville.getWeight());
                                bag.put("Bournville", bournville.getPrice());

                        }

                    }
                    break;
                case 2:
                    System.out.println("Pick your Favourite Cookie");
                    System.out.println("************* Options: \n For CaramelChip, press CAR \n For ChocoChip, press CHO \n For VanillaChip, press VAN *************");
                    String str = sc.next();
                    cookies cook;
                    if (str.equalsIgnoreCase("car")) {
                        cook = new CaramelChip();
                        if(cook instanceof CaramelChip) {
                            CaramelChip caramelChip = (CaramelChip) cook;
                            System.out.println("Your selected item's detail");
                            System.out.println("************* CaramelChip Cookie " + "Price: " + caramelChip.getPrice() + " Weight: " + caramelChip.getWeight() + " Calories: " + caramelChip.getCalories()+" *************");
                            //System.out.println(cook.toString());

                                cookie.add(caramelChip);
                                Weight.put("CaramelChip cookie", caramelChip.getWeight());
                                bag.put("CaramelChip Cookie", caramelChip.getPrice());

                        }
                    }

                   else if (str.equalsIgnoreCase("cho")) {
                        cook = new ChocoChip();
                        if(cook instanceof  ChocoChip) {
                            ChocoChip chocoChip = (ChocoChip) cook;
                            System.out.println("Your selected item's detail");
                            System.out.println("************* ChocoChip Cookie " + "Price: " + chocoChip.getPrice() + " Weight: " + chocoChip.getWeight() + " Calories: " + chocoChip.getCalories()+" *************");
                            //System.out.println(cook.toString());

                                cookie.add(chocoChip);
                                Weight.put("ChocoChip cookie", chocoChip.getWeight());
                                bag.put("ChocoChip Cookie", chocoChip.getPrice());

                        }
                    }

                    else if (str.equalsIgnoreCase("van")) {
                        cook = new VanillaEssence();
                        if(cook instanceof  VanillaEssence){
                            VanillaEssence vanillaEssence = (VanillaEssence) cook;
                        System.out.println("Your selected item's detail");
                         System.out.println("************* VanillaEssence Cookie "+ "Price: "+vanillaEssence.getPrice()+" Weight: "+vanillaEssence.getWeight()+" Calories: "+vanillaEssence.getCalories()+" *************");
                        //System.out.println(cook.toString());

                            cookie.add(vanillaEssence);
                            Weight.put("VanillaEssence cookie", vanillaEssence.getWeight());
                            bag.put("VanillaEssence Cookie", vanillaEssence.getPrice());

                    }}
                    break;
                case 3:
                    System.out.println("Pick your Favourite Cake");
                    System.out.println("************* Options: \n For BlueBerry, press BB \n For Butterscotch, press BS \n For Strawberry, press ST *************");
                    String cakeOpt = sc.next();
                    cake ca;
                    if (cakeOpt.equalsIgnoreCase("BB")) {
                        ca = new Blueberry();
                        if (ca instanceof Blueberry) {
                            Blueberry blueberry = (Blueberry) ca;
                            System.out.println("Your selected item's detail");
                            System.out.println("************* BlueBerry cake " + "Price: " + blueberry.getPrice() + " Weight: " + blueberry.getWeight() + " Calories: " + blueberry.getCalories()+ "*************");
                            //System.out.println(ca.toString());


                            cakes.add(blueberry);
                            Weight.put("Blueberry Cake", blueberry.getWeight());
                            bag.put("BlueBerry cake", blueberry.getPrice());

                        }
                    }

                   else if (cakeOpt.equalsIgnoreCase("BS")) {
                        ca = new Butterscotch();
                        if (ca instanceof Butterscotch) {
                            Butterscotch butterscotch = (Butterscotch) ca;
                            System.out.println("Your selected item's detail");
                            System.out.println("************* ButterScotch cake " + "Price: " + butterscotch.getPrice() + " Weight: " + butterscotch.getWeight() + " Calories: " + butterscotch.getCalories()+" *************");
                            cakes.add(butterscotch);
                            Weight.put("ButterScotch Cake", butterscotch.getWeight());
                            bag.put("ButterScotch cake", butterscotch.getPrice());

                        }
                    }

                    else if (cakeOpt.equalsIgnoreCase("ST")) {
                        ca = new Strawberry();
                        if (ca instanceof Strawberry) {
                            Strawberry strawberry = (Strawberry) ca;
                            System.out.println("Your selected item's detail");
                            System.out.println("************* Strawberry cake " + "Price: " + strawberry.getPrice() + " Weight: " + strawberry.getWeight() + " Calories: " + strawberry.getCalories()+ " *************");
                            //System.out.println(ca.toString());

                            cakes.add(strawberry);
                            Weight.put("Strawberry Cake", strawberry.getWeight());
                            bag.put("Strawberry cake", strawberry.getPrice());

                        }
                    }
                    break;
                case 10:
                    System.out.println("************* display chocolates by price low to high *************");
                    Collections.sort(AllChocolates, new getChocolatesByPrice());
                    for (int i = 0; i < AllChocolates.size(); i++) {
                        System.out.println(AllChocolates.get(i).toString());
                    }
                    break;
                case 11:
                    System.out.println("************* display chocolates by calories low to high *************");
                    Collections.sort(AllChocolates, new getChocolatesByCalories());
                    for (int i = 0; i < AllChocolates.size(); i++) {
                        System.out.println(AllChocolates.get(i).toString());
                    }
                    break;
                case 30:
                    System.out.println("************* display cookies by price low to high *************");
                    Collections.sort(AllCookies, new getCookiesByPrice());
                    for (int i = 0; i < AllCookies.size(); i++)
                        System.out.println(AllCookies.get(i).toString());
                    break;
                case 31:
                    System.out.println("************* display cookies by calories low to high *************");
                    Collections.sort(AllCookies, new getCookiesByCalories());
                    for (int i = 0; i < AllCookies.size(); i++)
                        System.out.println(AllCookies.get(i).toString());
                    break;
                case 0:
                    ArrayList<String> sortedBag = new ArrayList<>(bag.keySet());
                    Collections.sort(sortedBag);

                    System.out.println("************* Items in your bag has been sorted(Low to High) acc to Lexographical order *************");
                    for (String x : sortedBag) {
                        System.out.println("Item: " + bag.get(x) + " Price: " + x);
                    }

                    //finding total weight of the bag
                    ArrayList<Double> w = new ArrayList<>(bag.values());
                    double totalWeight = 0;
                    for (int i = 0; i < sortedBag.size(); i++)
                        totalWeight += w.get(i);

                    System.out.println("************* Do you want to search an item within a price range? *************");
                    char c = sc.next().charAt(0);
                    if(c=='y'|| c=='Y') {
                        //to find an item between a price range
                        System.out.println("Enter the initial price range");
                        int min = sc.nextInt();
                        System.out.println("Enter the highest price range");
                        int max = sc.nextInt();

                        Iterator itr2 = bag.entrySet().iterator();
                        while (itr2.hasNext()) {
                            Map.Entry<String, Double> val = (Map.Entry<String, Double>) itr2.next();
                            Double price = val.getValue();
                            if (price >= min && price <= max)
                                System.out.println("Sweet Name:- " + val.getKey());
                            else
                                continue;
                        }
                    }
                    else
                    System.out.println("Total weight of the bag is "+ totalWeight);
                    break;
                case -1:
                    System.out.println("*****************************Thank you for your valuable time.********************************");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Invalid option");
                    System.out.println("Chooose valid option ");
                    showMenu();

            }

        }while(n>=-1);

    }
}

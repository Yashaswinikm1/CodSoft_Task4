import java.util.HashMap;
import java.util.*;

public class CurrencyConverter
{
    public static void main(String args[])
    {
        HashMap<Integer,String> CurrencyCodes = new  HashMap<Integer,String>();

        CurrencyCodes.put(1,"USD");
        CurrencyCodes.put(2,"CAD");
        CurrencyCodes.put(3,"EUR");
        CurrencyCodes.put(4,"HKD");
        CurrencyCodes.put(5,"INR");

        String fromCode, toCode;
        double amount;

        Scanner scan = new Scanner(System.in);

        System.out.println("Hey!, Welcome to Currency converter");

        System.out.println("Currency converting FROM?: ");
        System.out.println("1:USD (US Dollars)\n2:CAD (Canadian Dollars)\n3:EUR (Euro)\n" +
                "4:HKD (Hong Kong Dollars)\n5:IND (Indian Rupee)\n");

        fromCode = CurrencyCodes.get(scan.nextInt());
        System.out.println("Currency converting TO?: ");
        System.out.println("1:USD (US Dollars)\n2:CAD (Canadian Dollars)\n3:EUR (Euro)\n" +
                "4:HKD (Hong Kong Dollars)\n5:IND (Indian Rupee)\n");

        toCode = CurrencyCodes.get(scan.nextInt());

        System.out.println("Amount you wish to convert?: ");
        amount = scan.nextFloat();

        //sendHttpGETRequest(fromCode,toCode,amount);

        System.out.println("Thank you for using the Currency Converter!");
    }


}

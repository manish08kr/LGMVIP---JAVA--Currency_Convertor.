import java.util.Scanner;

public class Currency_Convertor
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.println("Welcome to Currency Converter - ");
            System.out.print("Enter the amount you want to convert: ");

            double amount = sc.nextDouble();

            System.out.println("Select the currency to convert from :");
            System.out.println("1. USD (US Dollar)");
            System.out.println("2. INR (INDIAN Rupee)");
            System.out.println("3. EUR (Euro)");
            System.out.println("4. GBP (British Pound)");
            System.out.println("5. JPY (Japanese Yen)");
            System.out.println("6. SGD (Singapore Dollar)");

            int choiceFrom = sc.nextInt();

            System.out.println("Select the currency to convert from :");
            System.out.println("1. USD (US Dollar)");
            System.out.println("2. INR (INDIAN Rupee)");
            System.out.println("3. EUR (Euro)");
            System.out.println("4. GBP (British Pound)");
            System.out.println("5. JPY (Japanese Yen)");
            System.out.println("6. SGD (Singapore Dollar)");

            int choiceTo = sc.nextInt();

            double exchangeRate = 0.0; // variable to store the exchange rate

            // Set exchange rates based on user choices
            switch (choiceFrom) 
            {
                case 1:
                exchangeRate = 1.0; // USD to USD
                    break;
                    case 2:
                    exchangeRate = 83.09; // USD to INR
                    break;
                    case 3:
                    exchangeRate = 0.94; // USD to EUR
                    break;
                    case 4:
                    exchangeRate = 0.82; // USD to GBP
                    break;
                    case 5:
                    exchangeRate = 149.94; // USD to JPY
                    break;
                    case 6:
                    exchangeRate = 1.37; // USD to SGD
                    break;
                    default:
                    System.out.println("Invalid choice for currency to convert from.");
                    return;
                
   
            }

            // Convert to selected currency
            switch (choiceTo) {
                case 1:
                    // Convert to USD
                    amount *= exchangeRate;
                    break;
                case 2:
                    // Convert to INR
                    amount *= (exchangeRate / 83.09);
                    break;
                case 3:
                    // Convert to EUR
                    amount *= (exchangeRate / 0.94);
                    break;
                case 4:
                    // Convert to GBP
                    amount *= (exchangeRate / 0.82);
                    break;
                case 5:
                    // Convert to JPY
                    amount *= (exchangeRate / 149.94);
                    break;
                case 6:
                    // Convert to SGD
                    amount *= (exchangeRate / 1.37);
                    break;
                default:
                    System.out.println("Invalid choice for currency to convert to.");
                    return;
            }

            System.out.printf("Converted amount: %.2f\n", amount);
        }
    }
}


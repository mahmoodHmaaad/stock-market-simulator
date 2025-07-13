
import java.util.Scanner;
import java.util.Random;

public class Base {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
             Random random = new Random();

                    System.out.println("Welcome to the Stock Market Simulation!");
                    System.out.println("Please enter the number of stocks you want to simulate:");
                    int numberOfStocks = scanner.nextInt();
                    System.out.println("You have chosen to simulate " + numberOfStocks + " stocks.");
                    System.out.println("Please enter the initial price for each stock:");
                    double initialPrice = scanner.nextDouble();
                    System.out.println("You have set the initial price for each stock to $" + initialPrice);
                    System.out.println("Please enter the number of days you want to simulate:");
                    int numberOfDays = scanner.nextInt();
                    System.out.println("You have chosen to simulate " + numberOfDays + " days.");
                    System.out.println("Starting simulation...");

                    double[] stockPrices = new double[numberOfStocks];
                    for (int i = 0; i < numberOfStocks; i++) {
                        stockPrices[i] = initialPrice;
                    }

                    for (int day = 1; day <= numberOfDays; day++) {
                        System.out.println("Day " + day + ":");
                        for (int i = 0; i < numberOfStocks; i++) {
                            // Simulate price change between -5% and +5%
                            double changePercent = (random.nextDouble() * 10) - 5;
                            stockPrices[i] += stockPrices[i] * (changePercent / 100);
                            System.out.printf("  Stock %d: $%.2f (%.2f%%)\n", i + 1, stockPrices[i], changePercent);
                        }
                    }

                    System.out.println("Simulation complete.");
                    scanner.close();
                }
            }

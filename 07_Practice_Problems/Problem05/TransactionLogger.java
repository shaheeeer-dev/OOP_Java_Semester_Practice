package Problem05;

import java.io.FileWriter;
import java.io.IOException;

public class TransactionLogger {
    public static void saveTransaction(Transaction<?> transaction) {
        try (FileWriter writer = new FileWriter("07_Practice_Problems/Problem05/transactions.txt", true)) {
            writer.write(transaction.toString() + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}
//Problem 2: Product File Reader

package File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ProductFileReader {

    public void readProducts() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("data/products.csv"));
        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}

public class ProductFileReaderTest {
    public static void main(String[] args) {
        ProductFileReader p = new ProductFileReader();

        try {
            p.readProducts();
        }
        catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
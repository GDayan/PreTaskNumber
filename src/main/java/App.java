import service.Number;
import service.NumberService;
import service.impl.NumberServiceImpl;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class App {

    private static final NumberService numberService = new NumberServiceImpl();
    public static void main(String[] args) throws IOException {
        List<Number> numbers = new ArrayList<>();
        try(BufferedReader in = new BufferedReader(new FileReader("file.txt"))) {
            String s = in.readLine();
            String[] parts = s.split(" ");
            for (int i = 0; i < parts.length; i++)
            {
                numbers.add(new Number(Integer.parseInt(parts[i])));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Number num1 = new Number(numbers.get(0).getNumber());
        Number num2 = new Number(numbers.get(1).getNumber());

        System.out.println(numberService.getSum(num1, num2).getNumber());
        System.out.println(numberService.getDiff(num1, num2).getNumber());
        System.out.println(numberService.getmultiply(num1, num2).getNumber());
        System.out.println(numberService.getDivision(num1, num2).getNumber());
    }
}

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        final String FILE_PATH = "src/file.txt";
        List<A> stringList = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader(FILE_PATH));

            while(scanner.hasNext()) {
                A a = Factory.getObjectFromFile(scanner.nextLine()); // вызываем метод, который вернет готовый объект типа A, принимает ровно 1 целую строку из файла
                stringList.add(a);
            }

            for (A a: stringList){
                System.out.println(a);
            }

        } catch (FileNotFoundException e) {
            System.err.println("File " + FILE_PATH + " is not found");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}

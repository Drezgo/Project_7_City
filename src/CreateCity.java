import java.util.Scanner;
public class CreateCity {
    static String title;
    static int population;
    static double territory;
    static double moneyScore=10000.0;
    Scanner scan = new Scanner(System.in);
    public CreateCity() {
    }
    void newCity (){
        getTitle();
        getPopulation();
        getTerritory();
    }
    String getTitle() {
        System.out.print("Введіть назву Вашого міста: ");
        title=scan.next();
        return title;
    }
    int getPopulation() {
        System.out.print("Введіть кількість населення Вашого міста: ");
        population=scan.nextInt();
        return population;
    }

    double getTerritory() {
        System.out.print("Введіть територію Вашого міста (у км²) : ");
        territory=scan.nextDouble();
        return territory;
    }


}

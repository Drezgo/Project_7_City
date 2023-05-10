import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        CreateCity createCity=new CreateCity();
        ImproveCity improveCity = new ImproveCity();

        boolean activeSession=true;

        System.out.println("##################################_START_PAGE_###########################################");
        createCity.newCity();

        while (activeSession){
            System.out.println();
            System.out.println("###########################################################################################");
            System.out.println("________________________________________"+ CreateCity.title +"_______________________________________");
            System.out.println();
            StatisticsOfCity.cityStatistics();
            System.out.println();
            System.out.println("Оберіть дію: ");

            System.out.println("--[6] Керувати містом ");
            System.out.println("--[7] Статистика міста ");
            System.out.println("--[8] Правила ");
            System.out.println();
            System.out.println("--[0] EXIT ");
            System.out.println();
            System.out.print("---> ");
            int firstChoose = scan.nextInt();
            switch (firstChoose){
                case 6:
                    improveCity.interactionWthCity();
                    break;
                case 7:
                    StatisticsOfCity.fullCityStatistics();
                    break;
                case 8:
                    System.out.println("Coming Soon :)");
                    break;
                case 0:
                    activeSession=false;
                    break;
                default:
                    System.out.println("!!!!!!!!!!!!!ERROR!!!!!!!!!!!!!");
                    System.out.println("!!! Некоректне введення !!!");
                    break;
            }
        }




    }
}
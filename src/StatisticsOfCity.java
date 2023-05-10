public class StatisticsOfCity {
    static double populPerTerr;
    static void cityStatistics(){
        System.out.println(CreateCity.population);
        System.out.println(CreateCity.territory);
        System.out.println(CreateCity.moneyScore);
    }
    static void fullCityStatistics(){
        System.out.println(CreateCity.title);
        System.out.println(CreateCity.population);
        System.out.println(CreateCity.territory);
        System.out.println(CreateCity.moneyScore);
        System.out.println("На 1 людину приходиться "+populPerTerr+" км²" );
    }
    double calcPopulPerTerr(int p, double ter){
        populPerTerr=ter/(double) p;
        return (int) populPerTerr;
    }


}

public class Country {
    private String CountryName;
    private String Region;
    private int HappinessRank;
    private double HappinessScore;
    private double LCI;
    private double UCI;
    private double Economy;
    private double Family;
    private double Health;
    private double Freedom;
    private double Trust;
    private double Generosity;
    private double DystopiaResidual;
    private String value;

    public String getCountryName() {
        return CountryName;
    }

    public String getRegion()
    {
        return Region;
    }

    public int getHappinessRank() {
        return HappinessRank;
    }

    public double getHappinessScore() {
        return HappinessScore;
    }

    public double getLCI() {
        return LCI;
    }

    public double getUCI() {
        return UCI;
    }

    public double getEconomy() {
        return Economy;
    }

    public double getFamily() {
        return Family;
    }

    public double getHealth() {
        return Health;
    }

    public double getFreedom() {
        return Freedom;
    }

    public double getTrust() {
        return Trust;
    }

    public double getGenerosity() {
        return Generosity;
    }

    public double getDystopiaResidual() {
        return DystopiaResidual;
    }

    public Country(String args) {
        String[] values = args.split(",");
        CountryName = values[0];
        Region = values[1];
        HappinessRank = Integer.parseInt(values[2]);
        HappinessScore = Double.parseDouble(values[3]);
        LCI = Double.parseDouble(values[4]);
        UCI = Double.parseDouble(values[5]);
        Economy = Double.parseDouble(values[6]);
        Family = Double.parseDouble(values[7]);
        Health = Double.parseDouble(values[8]);
        Freedom = Double.parseDouble(values[9]);
        Trust = Double.parseDouble(values[10]);
        Generosity = Double.parseDouble(values[11]);
        DystopiaResidual = Double.parseDouble(values[12]);
        value = args;
    }
    public static int compareGenerosity (Country c1,Country c2){
        if(c1.getGenerosity()>c2.getGenerosity()){
            return 1;
        }
        return -1;
    }
    @Override
    public String toString()
    {
        return value;
    }
}

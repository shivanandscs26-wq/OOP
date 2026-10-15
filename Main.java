abstract class EnergySource
{
    int sourceID;
    String sourceName;
    double energyGenerated;

    EnergySource(int id, String name, double energy)
    {
        sourceID = id;
        sourceName = name;
        energyGenerated = energy;
    }

    abstract double calculateEfficiency();

    void display()
    {
        System.out.println("Source ID: " + sourceID);
        System.out.println("Source Name: " + sourceName);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
    }
}

class SolarEnergy extends EnergySource
{
    SolarEnergy(int id,String name,double energy)
    {
        super(id, name, energy);
    }

    double calculateEfficiency()
    {
        return (energyGenerated / 5000) * 100;
    }
}

class WindEnergy extends EnergySource
{
    WindEnergy(int id,String name,double energy)
    {
        super(id, name, energy);
    }
    double calculateEfficiency()
    {
        return (energyGenerated / 8000) * 100;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        EnergySource e;

        e = new SolarEnergy(101, "Solar Panel", 4000);

        e.display();
        System.out.println("Efficiency: " + e.calculateEfficiency() + "%");

        System.out.println();

        e = new WindEnergy(102, "Wind Turbine", 6400);

        e.display();
        System.out.println("Efficiency: " + e.calculateEfficiency() + "%");
    }
}




public class finalclass {
    public static void main(String[] args) {
        // Create instances of Manufacture
        Manufacture Corolla = new Manufacture("Corolla", "Japan");
        Manufacture tesla = new Manufacture("Tesla", "Germany");

        // Create instances of Engines
        CombustionEngine combustionEngine = new CombustionEngine();
        ElectricEngine electricEngine = new ElectricEngine();
        HybridEngine hybridEngine = new HybridEngine();

        // Create instances of Vehicles
       ICEV icev = new ICEV(Corolla, combustionEngine);
        BEV bev = new BEV(tesla, electricEngine);
       HybridV hybridV = new HybridV(Corolla, hybridEngine);

        // Create an array of Vehicles
      Vehicle[] vehicles = { icev, bev, hybridV };

        // Demonstrate characteristics using ShowCharacteristics()
        for (Vehicle vehicle : vehicles) {
            vehicle.showCharacteristics();
            System.out.println();
            
        }
    }
}


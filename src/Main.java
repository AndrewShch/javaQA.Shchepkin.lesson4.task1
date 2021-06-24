public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int totalMiles = service.calculate(10_450);
        System.out.println("Начислено миль " + totalMiles);
    }
}
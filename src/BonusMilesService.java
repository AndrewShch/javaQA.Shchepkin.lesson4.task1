public class BonusMilesService {
    public int calculate (int ticketPrice){
        int oneMile = 20;
        int totalMiles = ticketPrice / oneMile;
        return totalMiles;
    }
}

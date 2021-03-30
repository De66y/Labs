package tdd.opdr2;

public class TrajectPrijsService {
    private TrajectNaarTrajectEenhedenService tntes;
    private TrajectEenhedenNaarPrijsService tenps;

    public int getTrajectPrijs(String from, String to) {
        int eenheid = tntes.getTrajectEenheden(from, to);
        int bedrag = tenps.getPriceTrajectEenheden(eenheid);
        return eenheid * bedrag;
    }
}

public class FightJediAndSith {
    public static void main(String[] args) {
        final int jediHeight = 67;
        final int sithHeight = 7;
        final boolean jediWinner = jediHeight > sithHeight || sithHeight > jediHeight;
        final boolean sithWinner = sithHeight == jediHeight;
        final boolean sithPalpatin = true;
        final boolean jediWinnerObiVan = true;
        final boolean sithWinnerDartMol = true;
        if (jediWinner) {
            System.out.println("Джедай выйграл.");
        }
        if (sithWinner) {
            System.out.println("Ситх выйграл.");
        }
        if (sithPalpatin) {
            System.out.println("Ситх Полпатин выйграл.");
        }
        if (jediWinnerObiVan == sithWinnerDartMol) {
            System.out.println("Джедай Оби Ван выйграл у ситха Дарта Мола.");
        }
    }
}
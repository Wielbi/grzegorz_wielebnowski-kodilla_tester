public class MojaKolorowanka {

    enum MojeColory {
        B,
        C,
        N,
        R,
        P
    }

    public static void main(String[] args) {
        MojeColory barwy;
        barwy = MojeColory.R;

        switch (barwy) {
            case B:
                System.out.println("Pierwsza litera koloru BIALEGO TO ?" + barwy);
                break;
            case R:
                System.out.println("Pierwsza litera koloru ROZOWEGO TO ?" + barwy);
                break;
            case C:
                System.out.println("Pierwsza litera koloru CZERWONEGO TO ?" + barwy);
                break;
            case N:
                System.out.println("Pierwsza litera koloru NIEBIESKIEGO TO ?" + barwy);
                break;
            case P:
                System.out.println("Pierwsza litera koloru POMARANCZOWEGO TO ?" + barwy);
            default:
        }

    }
}
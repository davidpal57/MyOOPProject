public class Inotator extends Sportiv {

    @Override
    void seAntreneaza() {
        System.out.println("Inotatorul se antreneaza");
    }

    @Override
    public void seOdihneste() {
        System.out.println("Inotatorul se odihneste");
    }

    public Inotator(String tara, String sport) {
        super(tara, sport);
    }
}

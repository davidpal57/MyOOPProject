public class Maratonist extends Sportiv {
    @Override
    void seAntreneaza(){
        System.out.println("Maratonistul se antreneaza");
    }

    @Override
    public void seOdihneste() {
        System.out.println("Maratonistul se odihneste");
    }

    public Maratonist(String tara, String sport) {
        super(tara, sport);
    }
}

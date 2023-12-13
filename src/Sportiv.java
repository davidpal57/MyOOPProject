abstract class Sportiv { // daca declari o clasa noua cu abstract atunci (vezi mai jos)
    String tara;
    String sport;
    Abilitate abilitate;
    public Sportiv(String tara, String sport) {
        this.tara = tara;
        this.sport = sport;
    }
    abstract void seAntreneaza(); // abstract se folosete cand creezi un constructor pentru a forta clasele ce vor mostenii clasa aceasta sa implementeze si el inevitabil ce ai implementat in clasa cu abstract
    public void seOdihneste(){
        System.out.println("Sportivul se odihneste");
    }
}

public class Film {
    private String titlu; // daca e private inseamna ca nu poate fi accesat in main in mod direct, doar daca e public

    /*public String getTitlu(){
        return titlu;               1. getter
    }
    public void setTitlu(String titlu){  // asta e scris de mana, dar daca te duci la code, generate si dai setter and getter deodata, astea doua o sa le primesti
        this.titlu = titlu;         2. setter
    }*/

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }
}

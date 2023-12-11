public class Main {
    public static void main (String[] args){
        Carte carte1 = new Carte(); // cuvantul cheie new se foloseste la crearea/instantiere obiectelor
        carte1.autor = "Mihai Eminescu";
        carte1.titlu = "Poezii";
        carte1.pret = 35.00;

        Carte carte2 = new Carte();
        carte2.autor = "Ion Creanga";
        carte2.titlu = "Amintiri din copilarie";

        System.out.println(carte1.pret);
        System.out.println(carte2.pret);

        System.out.println(carte1.getPret());
        System.out.println(carte1.afiseaza());
        System.out.println(carte2.afiseaza());

        carte1.titlu = "Basme";
        System.out.println(carte1.afiseaza());

        Masina masina1 = new Masina();
        System.out.println(masina1.marca);
        Masina masina2 = new Masina();
        masina2.marca = "Dacia";
        System.out.println(masina2.marca);

        Masina masina3 = new Masina();
        Masina masina4 = new Masina();
        masina3.anFabricatie = 2010;
        masina4.anFabricatie = 2020;
        System.out.println(masina3.getanFabricatie());
        System.out.println(masina4.getanFabricatie());

        //System.out.println(masina4); - returneaza obiectul si locul sau in memorie

        Persoana persoana1 = new Persoana();
        System.out.println(persoana1.nume);
        System.out.println(persoana1.prenume);

        Persoana persoana2 = new Persoana("Ion","Popescu");
        System.out.println(persoana2.varsta + " " + persoana2.sex);
        //System.out.println(persoana2.sex);

        Persoana persoana3 = new Persoana(45,"M","Pop");
        System.out.println(persoana3.varsta + " " + persoana3.sex + " " + persoana3.nume);

        Masina masina5 = new Masina();
        System.out.println(masina5.marca);

        Masina masina6 = new Masina("Tesla", 2022);
        System.out.println(masina6.marca + " " + masina6.getanFabricatie());

        Animal animal1 = new Animal();
        Animal animal2 = new Animal("Azorel");
        Animal animal3 = new Animal("Pisi", "maro");
        Animal animal4 = new Animal("Nemo", "rosu", true);

        animal1.mananca();
        animal2.doarme();
        animal3.mananca();
        animal4.doarme();
        animal4.nume = "Nume2";

        System.out.println(animal4.afiseaza());
        System.out.println(animal3.afiseaza());

        Elev elev1 = new Elev("Popescu");
        Elev elev2 = new Elev("Ionescu");
        System.out.println(elev1.nume);
        System.out.println(elev2.nume);
        elev1.diriginte = "Isoscel2";
        System.out.println(elev2.diriginte);

        elev1.metodaNonStatica();
        elev2.metodaStatica();

        Film film1 = new Film();
        film1.setTitlu("Titanic");
        System.out.println(film1.getTitlu());

        Inotator inotator1 = new Inotator();
        inotator1.seAntreneaza();
        inotator1.seOdihneste();

        Maratonist maratonist1 = new Maratonist();
        maratonist1.seAntreneaza();
        maratonist1.seOdihneste(); //,
    }
}

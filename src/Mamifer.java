public class Mamifer extends Animal{
    String numeAnimal;
    public Mamifer(String numeAnimal) {
        this.numeAnimal = numeAnimal;
    }
    public Mamifer(){
        this.numeAnimal = "unknown";
    }
    public void scoateSunete() {
        System.out.println(numeAnimal + " scoate sunete.");
    }

}

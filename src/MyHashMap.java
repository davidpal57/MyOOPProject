import java.util.HashMap;

public class MyHashMap {
    /*public static void examenTrecut (HashMap <String, Boolean> studentiTrecuti){
        System.out.println("Studentii ce au trecut examenul sunt: ");
        /*for (Boolean value: studentiTrecuti.values()){
            if (studentiTrecuti.containsValue(true)){
                System.out.println(studentiTrecuti.);
            }
        }*/
        /*for (int i = 1; i<=studentiTrecuti.size(); i++){
            if (studentiTrecuti.containsValue(true))
                System.out.println(studentiTrecuti.get(i));
        }*/
        /*int i = 0;
        for (String key: studentiTrecuti.keySet()){
            if (studentiTrecuti.containsValue(true))
                System.out.println(studentiTrecuti.get(i));
            i++;
        }
    }*/
    public static void main(String[] args) {
        HashMap <Integer, String> dictionarulNostru = new HashMap<>();
        dictionarulNostru.put(1, "First");
        dictionarulNostru.put(2, "Second");
        dictionarulNostru.put(3, "Third");
        dictionarulNostru.put(4, "Fourth");
        //dictionarulNostru.replace(3, "Third-replaced");
        System.out.println(dictionarulNostru.replace(3, "Third", "Third-replaced"));

        System.out.println(dictionarulNostru.get(3));
        System.out.println(dictionarulNostru.keySet());
        System.out.println(dictionarulNostru.values());
        System.out.println(dictionarulNostru.size());
        dictionarulNostru.remove(3);
        System.out.println(dictionarulNostru.size());
        System.out.println(dictionarulNostru.entrySet());
        dictionarulNostru.replace(2,"Second-replaced");
        System.out.println(dictionarulNostru.get(2));
        System.out.println(dictionarulNostru.containsValue("Inexistent"));
        System.out.println(dictionarulNostru.containsKey(1111));

        for (int key: dictionarulNostru.keySet()){
            System.out.println(key);
        }

        for (String value: dictionarulNostru.values()){
            System.out.println(value);
        }

        HashMap<String, Boolean> studenti = new HashMap<>();
        studenti.put("Alex", true);
        studenti.put("Bogdan", true);
        studenti.put("Cezar", false);
        studenti.put("Sebastian", false);
        studenti.put("Darius", true);

        for (String student: studenti.keySet()){
            if (studenti.get(student)){
                System.out.println(student);
            }
        }
    }
}

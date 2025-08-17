import java.lang.Comparable;

public class Hero implements Comparable<Hero>{

    // attributs
    private String name;
    private int age;

    // constructeurs
    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //compareTo methode
    @Override
    public int compareTo(Hero hero) {
        int nameResult =  this.name.compareTo(hero.name);
        if(nameResult == 0) {
            return this.age - hero.age;
        } else {
            return nameResult;
        }
    }


    // accesseurs (getters)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // mutateurs (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

//Modifie la classe Hero afin d'implémenter Comparable. L'ordre de tri par défaut sera sur l'attribut name, par ordre croissant.
//Dans la classe Thanos, fait en sorte que la liste de héros soit bien triée comme voulu.
//Dans la classe Thanos, ajoute un Comparator permettant de trier la liste de héros sur l'attribut age décroissant.

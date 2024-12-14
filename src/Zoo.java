public class Zoo {

    public Animal[] animals;
    public String name;
    public String city;
    public int nbCages;
    public int nbAnimaux;


    public Zoo() {
        animals = new Animal[5];
    }

    public Zoo(String name, String city, int nbCages) {
        this.name = name;
        this.city = city;
        this.nbCages = nbCages;
        this.animals = new Animal[nbCages];
    }

    public void displayZoo() {
        System.out.println("Name: " + name + " , city:" + city + ", nbCages:" + nbCages + ", nbAnimaux:" + nbAnimaux);
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i].name + " , " + animals[i].age);
            } else break;
        }
    }

    public void displayZoo2() {
        System.out.println("Name: " + name + " , city:" + city + ", nbCages:" + nbCages + ", nbAnimaux:" + nbAnimaux);
        for (int i = 0; i < nbAnimaux; i++) {
            System.out.println(animals[i].name + " , " + animals[i].age);
        }
    }

    public void ajouterAnimal(Animal animal) {
        if (nbAnimaux < animals.length) {
            animals[nbAnimaux] = animal;
            nbAnimaux++;
        }
    }

    public int searchAnimal(Animal animal) {
        for(int i=0 ; i<nbAnimaux ; i++ ){
        if (animals[i].name.equals(animal.name) == true ) {
            return i ;
        }

    }  return -1;
    }

    public boolean aadAnimal(Animal animal) {
        if((searchAnimal(animal) == -1)){
        if (nbAnimaux < animals.length) {
            animals[nbAnimaux] = animal;
            nbAnimaux++;
            return true;
        }

    }
        return false;
    }
boolean removeAnimal(Animal animal){

        if(searchAnimal(animal) == -1){
            animals[nbAnimaux] = animals[nbAnimaux+1];
            nbAnimaux--;
        return true ;
        }
        return  false ;
}

    public String toString() {
        String ch1 = "", ch2 = "";
        ch1 = "Name: " + name + " ,city:" + city + " ,nbAnimaux:" + nbAnimaux + "\n";
        for (int i = 0; i < nbAnimaux; i++) {
            ch2 = ch2 + animals[i] + "\n";
        }
        return ch1 + ch2;
    }
}

public class ZooManagement {

    public static void main(String[] args){
        //Constructeur
        Animal lion = new Animal("Carnivore","Lion",4,true);
        System.out.println(lion.name);
        System.out.println(lion.age);

        //Constructeur paramètré
        Animal chat = new Animal("Carnivore","Chat",2,true);
        System.out.println(chat.name);
        System.out.println(chat.age);

        Animal daulphin = new Animal("Carnivore","Dauphin",3);
        System.out.println(daulphin.isMammal);

        Zoo myZoo = new Zoo("Belvedere","Tunis",17);
       // System.out.println(myZoo.animals.length);



        myZoo.ajouterAnimal(lion);
        myZoo.ajouterAnimal(chat);
        myZoo.ajouterAnimal(daulphin);
        myZoo.displayZoo();
        System.out.println("-----------");
        System.out.println(lion);


        System.out.println(myZoo.aadAnimal(chat));
        System.out.println(myZoo.aadAnimal(chat));
        System.out.println(myZoo.aadAnimal(chat));
        System.out.println(myZoo.aadAnimal(chat));
        System.out.println(myZoo.aadAnimal(chat));
        System.out.println(myZoo.aadAnimal(chat));
        System.out.println(myZoo.aadAnimal(chat));

       System.out.println(myZoo.searchAnimal(chat));





    }

}

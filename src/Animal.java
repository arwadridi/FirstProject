public class Animal {

    public String family;
    public String name;
    public int age;
    public boolean isMammal;

    public Animal(){

    }


    /*
    public Animal(String family, String name, int age, boolean isMammal){
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

     */

    public Animal(String familyA, String nameA, int ageA, boolean isMammalA){
        family = familyA;
        name = nameA;
        age = ageA;
        isMammal = isMammalA;
    }

    public Animal(String family, String name, int age){
        this.family = family;
        this.name = name;
        this.age = age;
    }
//gggggggggggg

    @Override //Redéfiniton
    public String toString(){
        return "Family: "+family +", Name:"+name +", age:"+age;
    }
}

package animals;

public class Cat {
    private String name;
    private String breed;
    private int age;
    private double patches;
    private String personality;

    public Cat(String name, String breed, int age, double patches) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.patches = patches;
    }
    private String noise(String personality) {
        String  noise= "";
        if(personality.equalsIgnoreCase("nice") ) {
            noise = "puurr";}
        else if (personality.equalsIgnoreCase("normal")) {
            noise = "meow";}
        else{
                    noise = "hissss";
                }
        return noise;


}}
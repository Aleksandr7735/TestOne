package Newcom.klass;

public class Dog {
    private String breed;
    private int age;
    private String color;

    public Dog(String breed, int age,String color){
        this.age = age;
        this.breed=breed;
        this.color=color;

    }
    public void slip (){
        System.out.println("dog splin");
    }
    public void eat (){
        System.out.println("Dog eat");
    }
    public void play(){
        System.out.println("Dog play");

    }
    public void getInfo(){
        System.out.println(color);
        System.out.println(breed);
    }

}

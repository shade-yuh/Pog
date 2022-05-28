public class Pog {
    private String name;
    private int age;
    private boolean sleeping;

    public Pog() {
        name = "Todd";
        age = 5;
        sleeping = false;
    }

    public Pog(String name) {
        this.name = name;
        age = 4;
        sleeping = false;
    }

    public String getName() {return name;}
    public int getAge() {return age;}
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

}

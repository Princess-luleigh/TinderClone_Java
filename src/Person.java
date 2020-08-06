public class Person {

    // instance
    private String name;
    private int age;
    private String gender;
    private String location;
    private String bio;

    // constructor
    Person(String name, int age, String gender, String location, String bio) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.location = location;
        this.bio = bio;
    }

    // methods

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    // getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public String getLocation() {
        return this.location;
    }

    public String getBio() {
        return this.bio;
    }

}
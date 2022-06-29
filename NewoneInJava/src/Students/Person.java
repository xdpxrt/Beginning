package Students;

public class Person {
    private String name;
    private String gender;
    private int yearOfBirth;


    public Person() {
    }

    public Person(String name, String gender, int yearOfBirth) {
        this.name = name;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return this.gender;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOFBirth() {
        return this.yearOfBirth;
    }
}
fff
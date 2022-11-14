public class Fio implements Comparable<Fio>{
    private String firstname;
    private String lastname;
    private String patronymic;
    int age;

    public Fio(String firstname, String lastname, String patronymic, int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.patronymic = patronymic;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return new StringBuilder(firstname+ " "
                + lastname + " " + patronymic + " "
                + age ).toString();
    }

    @Override
    public int compareTo(Fio o) {
        return this.age - o.getAge();
    }
}

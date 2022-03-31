package Players;

public class Player {

    private String name;
    private int age;
    private String role;
    private String gender;
    private int jerseyNumber;
    private String typeOfPlayer;
    private String nationality;
    private String state;

    public Player(){}

    public Player(String name, String gender, int age, String role,  String typeOfPlayer, String state,  String nationality) {
        this.name = name;
        this.gender = gender;
        this.age = age;
       this.state = state;
        this.typeOfPlayer = typeOfPlayer;
        this.nationality = nationality;
        this.role = role;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public void setTypeOfPlayer(String typeOfPlayer) {
        this.typeOfPlayer = typeOfPlayer;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRole() {
        return role;
    }

    public String getGender() {
        return gender;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public String getTypeOfPlayer() {
        return typeOfPlayer;
    }

    public String getNationality() {
        return nationality;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                ", gender='" + gender + '\'' +
                ", jerseyNumber=" + jerseyNumber +
                ", typeOfPlayer='" + typeOfPlayer + '\'' +
                ", nationality='" + nationality + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

}

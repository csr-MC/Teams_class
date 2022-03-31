package Runner;


import Teams.Team;
import java.io.*;


public class RunnerClass {

    public static void main(String[] args) throws IOException {
        Team t = new Team("Cricket","players_data.txt");
        t.averageAge();
        t.skillDisplay();
        t.stateDisplay();
        t.sortByNames();
        t.sortByAge();
    }

}

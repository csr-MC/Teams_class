package Teams;

import Players.Player;


import java.io.*;
import java.util.*;

public class Team {

    private String teamName;
    private List<Player> players = new ArrayList<>();


    public Team(String teamName, String fileName) throws IOException {
       fileReader(teamName,fileName);
    }




    private void fileReader(String TeamName,String fileName) throws IOException {


        this.teamName = TeamName;
        File file = new File(fileName);
        Reader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;

        while ((line = bufferedReader.readLine())!= null){

            String[] s = line.split("\\t+");


            Player player = new Player(s[0],s[1],Integer.parseInt(s[2]),s[3],s[4],s[5],s[6]);
            players.add(player);



        }
        System.out.println("==================================================================================");
        System.out.println("Content of File : ");

        for (int i = 0; i < players.size() ; i++) {
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("Name : "+players.get(i).getName());
            System.out.println("Age : "+players.get(i).getAge());
            System.out.println("Skill : "+players.get(i).getTypeOfPlayer());
            System.out.println("Role : "+players.get(i).getRole());
            System.out.println("State : "+players.get(i).getState());
            System.out.println("Gender : "+players.get(i).getGender());
            System.out.println("Nationality : "+players.get(i).getNationality());

        }






    }







    public float averageAge(){
        float avrg = 0;
        for (int i = 0; i <players.size() ; i++) {

           avrg = players.get(i).getAge() + avrg;

        }
        System.out.println("==================================================================================");
        System.out.printf("Average age of all player's is : %.2f\n",(avrg/ players.size()));
        return (avrg/ players.size());
    }

    public Map<String, Integer>  skillDisplay(){

        Map<String, Integer> skill = new HashMap<>();

        for (int i = 0; i < players.size(); i++) {
            if(skill.containsKey(players.get(i).getTypeOfPlayer())){
                skill.put(players.get(i).getTypeOfPlayer(), skill.get(players.get(i).getTypeOfPlayer())+1);
            }else {
                skill.put(players.get(i).getTypeOfPlayer(), 1);
            }

        }
        System.out.println("==================================================================================");
        System.out.println("Players count according to skill : ");
        System.out.println("----------------------------------------------------------------------------------");
        for (Map.Entry<String,Integer> entry : skill.entrySet())
            System.out.println(entry.getKey() +
                    " = " + entry.getValue());



        return skill;

    }



    public Map<String, Integer> stateDisplay(){

        Map<String, Integer> skill = new HashMap<>();

        for (int i = 0; i < players.size(); i++) {

            if(skill.containsKey(players.get(i).getState())){
                skill.put(players.get(i).getState(), skill.get(players.get(i).getState())+1);

            }else {
                skill.put(players.get(i).getState(), 1);
            }
        }

        System.out.println("==================================================================================");
        System.out.println("Players count according to state : ");
        System.out.println("----------------------------------------------------------------------------------");
        for (Map.Entry<String,Integer> entry : skill.entrySet())
            System.out.println(entry.getKey() +
                    " = " + entry.getValue());


        return skill;
    }



    public List<Player> sortByNames(){

        SortByName sortByName = new SortByName();
        Collections.sort(players, sortByName);

        System.out.println("==================================================================================");
        System.out.println("Sorted according to Name : ");

        for (int i = 0; i < players.size() ; i++) {
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("Name : "+players.get(i).getName());
            System.out.println("Age : "+players.get(i).getAge());
            System.out.println("Skill : "+players.get(i).getTypeOfPlayer());
            System.out.println("Role : "+players.get(i).getRole());
            System.out.println("State : "+players.get(i).getState());
            System.out.println("Gender : "+players.get(i).getGender());
            System.out.println("Nationality : "+players.get(i).getNationality());

        }
       return players;
    }

    public List<Player> sortByAge(){

         SortingAge sortingAge = new SortingAge();
        Collections.sort(players, sortingAge);

        System.out.println("==================================================================================");
        System.out.println("Sorted according to age : ");

        for (int i = 0; i < players.size() ; i++) {
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("Name : "+players.get(i).getName());
            System.out.println("Age : "+players.get(i).getAge());
            System.out.println("Skill : "+players.get(i).getTypeOfPlayer());
            System.out.println("Role : "+players.get(i).getRole());
            System.out.println("State : "+players.get(i).getState());
            System.out.println("Gender : "+players.get(i).getGender());
            System.out.println("Nationality : "+players.get(i).getNationality());

        }
        return players;
    }

    }

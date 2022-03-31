package Teams;

import Players.Player;

import java.util.Comparator;

public class SortingAge  implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getAge() < o2.getAge()) return -1;
        if (o1.getAge() > o2.getAge()) return 1;
        else return 0;
    }



}

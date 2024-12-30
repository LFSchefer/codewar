package org.example;

import java.util.*;

public class IsoContest {
    public static void main( String[] argv ) throws Exception {
        String  line;
        List<String> inputs = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            line = sc.nextLine();
            inputs.add(line);
        }
        var nbPizzeria = inputs.get(0).split(" ")[0];
        inputs.remove(0);
        List<String> pizzeria = new ArrayList<>();
        List<String> commande = new ArrayList<>();
        for (int i = 0; i < inputs.size(); i++) {
            if (i < Integer.parseInt(nbPizzeria)) {
                pizzeria.add(inputs.get(i));
            } else {
                commande.add(inputs.get(i));
            }
        }
        List<String[]> pGps = pizzeria.stream().map( c -> c.split(" ")).toList();
        List<String[]> cGps = commande.stream().map( c -> c.split(" ")).toList();
        calculateDistance(pGps,cGps);
    }

    private static void calculateDistance(List<String[]> pizzerias, List<String[]> commands) {
        List<Integer> allDist = new ArrayList<>();
        commands.forEach(command -> allDist.add(findCloseset(command, pizzerias)));
        System.out.println(allDist.stream().mapToInt(Integer::intValue).sum());
    }

    private static Integer findCloseset(String[] command, List<String[]> pizzerias) {
        List<Integer> distances = new ArrayList<>();
        pizzerias.forEach(pizzeria -> distances.add(manathanDistance(command, pizzeria)));
        return distances.stream().sorted().toList().get(0) * 2;
    }

    private static Integer manathanDistance(String[] command, String[] pizzeria) {
        int x = Integer.parseInt(command[0]) - Integer.parseInt(pizzeria[0]);
        if ( x < 0 ) {
            x = - x;
        }
        int y = Integer.parseInt(command[1]) - Integer.parseInt(pizzeria[1]);
        if ( y < 0 ) {
            y = - y;
        }
        return x + y;
    }
}


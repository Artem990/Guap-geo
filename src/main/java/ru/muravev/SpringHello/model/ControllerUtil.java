package ru.muravev.SpringHello.model;

import java.util.*;

public class ControllerUtil {
    public static List<String> getUniqueDates (List<Dump> dumps) {
        Set <String> dates = new HashSet<>();
        for (Dump geoObj: dumps){
            dates.add(geoObj.getDate());
        }
        List<String> datesList = new ArrayList<>(dates);
        Collections.sort(datesList);
        return datesList;
    }
}

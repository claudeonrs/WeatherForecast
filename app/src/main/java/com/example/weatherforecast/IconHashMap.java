package com.example.weatherforecast;

import java.util.HashMap;
import java.util.Map;

// HashMap to link forecast to emoji/icons
public class IconHashMap {
    private Map<String, String> iconHashMap = new HashMap<String, String>();

    public IconHashMap() {

        iconHashMap.put("Partly Cloudy (Night)", "☁");
        iconHashMap.put("Partly Cloudy (Day)", "\uD83C\uDF24");
        iconHashMap.put("Fair (Night)", "\uD83C\uDF19");
        iconHashMap.put("Fair (Day)", "☀");
        iconHashMap.put("Fair and Warm", "☀");
        iconHashMap.put("Cloudy", "☁");

        iconHashMap.put("Light Rain", "\uD83C\uDF26");
        iconHashMap.put("Showers", "\uD83C\uDF27");
        iconHashMap.put("Thundery Showers", "\u26C8");
    }


    public Map<String, String> getIconHashMap() {
        return iconHashMap;
    }
}

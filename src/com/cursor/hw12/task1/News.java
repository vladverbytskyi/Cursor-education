package com.cursor.hw12.task1;

import java.util.HashMap;
import java.util.Map;

public class News {
    private Map<String, String> news = new HashMap<>();

    public void addNews() {
        news.put("Warm", "The world is getting warmer. ");
        news.put("Danger", "There are wildfires in Australia");
        news.put("Volcano", "Taal is a volcano in the Philippines");
        news.put("Shoots Plane", "Last week, a Ukrainian plane crashes in Iran");
        news.put("Awkwafina", "Actress Awkwafina acts in some famous movies. ");
        news.put("Protests", "Thousands of people protest in Hong Kong. ");
        news.put("Bomb", "A bomb explodes in a truck in Mogadishu");
        news.put("Airlines", "Lufthansa has a cheap airlines called Eurowings");
        news.put("Internet", "Russia wants to have its own Internet");
        news.put("Sudan", "Omar al-Bashir is Sudan’s president earlier this year");
    }

    public String getValue(String key) {
        return news.get(key);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

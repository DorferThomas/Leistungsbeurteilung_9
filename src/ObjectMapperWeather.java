

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ObjectMapperWeather
{

    public Weather readJson() throws IOException {

        //benötigt man um ein Json zu lesen und Schreiben
        ObjectMapper objectMapper = new ObjectMapper();

        //klasse von JAckson API...Json Datein zu beschreiben oder zu lesen
        //neues wetter Objekt mit den Daten der Json Datei
        Weather wetter = objectMapper.readValue(new File("src/weather.json"), Weather.class);

        //das objekt wetter wird returned
        return wetter;



    }

}
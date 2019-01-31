import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;



    public class Main
    {
        public static void main(String[] args) throws JAXBException {

            try
            {
                System.out.println("Aufgabe1:__________________________________________________________\n");
                //erstellt ein neues Weather Objekt

                ObjectMapperWeather omw = new ObjectMapperWeather();
                //gibt ein Weather Objekt auf der Konsole aus
                System.out.println(omw.readJson());





                

                System.out.println("\n\nAufgabe2:__________________________________________________________\n");
                //wandelt den kontent der weather.class in ein jaxb context um
                JAXBContext jaxbContext = JAXBContext.newInstance(Weather.class);
                //neuen Marshaller angelegt
                Marshaller marshaller = jaxbContext.createMarshaller();
                //Legt  die jeweilige Eigenschaft in der zugrunde liegenden Implementierung von Marshaller fest .
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                //speichert den Inhalt in die angegebene Datei
                marshaller.marshal(omw.readJson(), new File("src/weather.xml"));
                //Marshalling zu einem java.io.OutputStream:
                marshaller.marshal(omw.readJson(), System.out);



                System.out.println("\n\nAufgabe3:___________________________________________________________\n");
                File file = new File("src/weather.xml");
                //Entpacken Sie XML-Daten aus der angegebenen Datei und geben Sie die resultierende Inhaltsstruktur zurück.
                Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
                System.out.println(unmarshaller.unmarshal(file));


            }
            catch(IOException e)
            {
                e.printStackTrace();
            }





        }
    }


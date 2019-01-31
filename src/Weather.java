import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Weatehr")
public class Weather
{


    private int id;

    private String main;

    private String description;

    private String icon;





    @XmlElement(name="id")
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    @XmlElement(name="Main")
    public String getMain() {
        return main;
    }
    public void setMain(String main) {
        this.main = main;
    }


    @XmlElement(name="Description")
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @XmlElement(name="Icon")
    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + ", Main: " + getMain() + ", Description: " + getDescription() + ", Icon: " + getIcon();
    }

    public Weather(int id, String main, String description, String icon) {
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }

    public Weather(){}
}
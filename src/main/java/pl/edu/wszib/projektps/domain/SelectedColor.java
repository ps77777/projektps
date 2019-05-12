package pl.edu.wszib.projektps.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name="selected_colors")
public class SelectedColor {//mapowanie javy do sql- to jest wiersz tab selected_colors
   @Id
   @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    private String color;
    private Date ctime;

    public SelectedColor() {
    }

    public SelectedColor(String color, Date ctime) {
        this.color = color;
        this.ctime = ctime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}

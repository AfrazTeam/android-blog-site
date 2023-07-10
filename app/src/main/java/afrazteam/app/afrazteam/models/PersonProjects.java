package afrazteam.app.afrazteam.models;

import java.io.Serializable;
import java.util.List;

public class PersonProjects implements Serializable {
    private String name;
    private List<Project> projects;


    public PersonProjects(String name, List<Project> projects) {
        this.name = name;
        this.projects = projects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}

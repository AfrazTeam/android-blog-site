package afrazteam.app.afrazteam.models;

import java.io.Serializable;

public class Project implements Serializable {
    private int imageProject;
    private String titleProject;
    private String dateProject;



    public int getImageProject() {
        return imageProject;
    }

    public void setImageProject(int imageProject) {
        this.imageProject = imageProject;
    }

    public String getTitleProject() {
        return titleProject;
    }

    public void setTitleProject(String titleProject) {
        this.titleProject = titleProject;
    }

    public String getDateProject() {
        return dateProject;
    }

    public void setDateProject(String dateProject) {
        this.dateProject = dateProject;
    }
}

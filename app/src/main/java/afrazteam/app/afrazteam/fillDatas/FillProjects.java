package afrazteam.app.afrazteam.fillDatas;

import java.util.ArrayList;
import java.util.List;

import afrazteam.app.afrazteam.models.PersonProjects;
import afrazteam.app.afrazteam.models.Project;

public class FillProjects {

    public static List<PersonProjects> personProjectsList;
    public static List<Project> projectList;

    public static List<Project> projects() {
        projectList = new ArrayList<>();
        projectList.add(new Project());
        projectList.add(new Project());
        projectList.add(new Project());
        projectList.add(new Project());
        projectList.add(new Project());

        return projectList;

    }

    public static List<PersonProjects> personProjects() {
        personProjectsList = new ArrayList<>();
        personProjectsList.add(new PersonProjects("احسان صفری", projectList));
        personProjectsList.add(new PersonProjects("سامان صوفی بیرام", projectList));
        personProjectsList.add(new PersonProjects("هژار قادری", projectList));
        personProjectsList.add(new PersonProjects("اکام نجاتی", projectList));

        return personProjectsList;
    }

}

package afrazteam.app.afrazteam;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import afrazteam.app.afrazteam.adapters.ProjectsAdapter;
import afrazteam.app.afrazteam.fillDatas.FillProjects;
import afrazteam.app.afrazteam.models.Project;

public class UserProjectsActivity extends AppCompatActivity {

    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_projects);

        init();
    }

    private void init(){
        bindViews();
        List<Project> projects = FillProjects.projects();

        recycler.setAdapter(new ProjectsAdapter(projects));
        recycler.setLayoutManager(new LinearLayoutManager(this));
    }
    private void bindViews(){
        recycler = findViewById(R.id.userProjectsRecycler);
    }

}
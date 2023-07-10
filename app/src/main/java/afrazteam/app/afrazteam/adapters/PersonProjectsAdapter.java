package afrazteam.app.afrazteam.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import afrazteam.app.afrazteam.R;
import afrazteam.app.afrazteam.UserProjectsActivity;
import afrazteam.app.afrazteam.models.PersonProjects;

public class PersonProjectsAdapter extends RecyclerView.Adapter<PersonProjectsAdapter.MyViewHolder> {
    private List<PersonProjects> personProjectsList;
    private Context context;

    public PersonProjectsAdapter(List<PersonProjects> personProjectsList, Context context) {
        this.personProjectsList = personProjectsList;
        this.context = context;
    }

    @Override
    public PersonProjectsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.main_project_item, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        PersonProjects personProjects = personProjectsList.get(position);
        holder.userName.setText(personProjects.getName());


        // Set up the RecyclerView for this category
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(holder.recyclerView.getContext()));
        ProjectsAdapter adapter = new ProjectsAdapter(personProjects.getProjects());
        holder.recyclerView.setAdapter(adapter);
        holder.recyclerView.setLayoutManager(new GridLayoutManager(context, 2, GridLayoutManager.HORIZONTAL, false));

        // Set up the OnClickListener for viewAll
        holder.viewAllProjects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, UserProjectsActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return personProjectsList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView userName;
        public TextView viewAllProjects;
        public RecyclerView recyclerView;

        public MyViewHolder(View itemView) {
            super(itemView);
            userName = itemView.findViewById(R.id.user_name);
            viewAllProjects = itemView.findViewById(R.id.view_all_projects);
            recyclerView = itemView.findViewById(R.id.recyclerItemProject);
        }
    }
}
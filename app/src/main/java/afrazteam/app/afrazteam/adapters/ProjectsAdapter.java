package afrazteam.app.afrazteam.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import afrazteam.app.afrazteam.R;
import afrazteam.app.afrazteam.models.Project;

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ViewHolder> {
    private List<Project> projectList;


    public ProjectsAdapter(List<Project> projectList) {
        this.projectList = projectList;
    }

    @Override
    public ProjectsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.project_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Project project = projectList.get(position);
        // holder.imageIconTime.setImageResource(project.getImageProject());
        // holder.titleProject.setText(project.getTitleProject());
        // holder.dateProject.setText(project.getDateProject());
    }

    @Override
    public int getItemCount() {
        return projectList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageIconTime;
        public TextView titleProject;
        public TextView dateProject;

        public ViewHolder(View itemView) {
            super(itemView);
            imageIconTime = itemView.findViewById(R.id.imageView);
            titleProject = itemView.findViewById(R.id.title_project);
            dateProject = itemView.findViewById(R.id.date_project);
        }
    }

}
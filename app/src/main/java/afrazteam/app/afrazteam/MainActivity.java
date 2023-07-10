package afrazteam.app.afrazteam;

import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.AnimationTypes;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

import afrazteam.app.afrazteam.adapters.PersonProjectsAdapter;
import afrazteam.app.afrazteam.fillDatas.FillProjects;
import afrazteam.app.afrazteam.models.PersonProjects;
import afrazteam.app.afrazteam.models.Project;

public class MainActivity extends AppCompatActivity {

    private MaterialToolbar toolbar;
    private ImageSlider imageSlider;
    private RecyclerView mainRecyclerProjects;
    private boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        bindViews();
        fillSliderData();
        fillRecyclerData();
    }

    private void init() {


    }

    private void fillRecyclerData() {
        // اضافه کردن لیست های برنامه مویسان و پروژه های انان
        List<Project> projectList = FillProjects.projects();

        List<PersonProjects> personProjectsList = FillProjects.personProjects();

        mainRecyclerProjects.setAdapter(new PersonProjectsAdapter(personProjectsList, this));
        mainRecyclerProjects.setLayoutManager(new LinearLayoutManager(this));


    }

    private void fillSliderData() {
        List<SlideModel> imageList = new ArrayList<>();

        imageList.add(new SlideModel(R.drawable.img_slider3, "And people do that.", ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.img_slider1, "The animal population decreased by 58 percent in 42 years.", ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.img_slider2, "Elephants and tigers may become extinct.", ScaleTypes.FIT));

        imageSlider.setImageList(imageList);
        imageSlider.setSlideAnimation(AnimationTypes.BACKGROUND_TO_FOREGROUND);
        imageSlider.setAnimation(imageSlider.getAnimation());
    }

    private void bindViews() {
        toolbar = findViewById(R.id.topAppBar);
        imageSlider = findViewById(R.id.image_slider);
        mainRecyclerProjects = findViewById(R.id.mainRecyclerProjects);
    }

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;

        Snackbar snackbar = Snackbar.make(mainRecyclerProjects, R.string.twice_back, Snackbar.LENGTH_LONG);
        snackbar.getView().setTranslationY(-130);
        snackbar.show();

        new Handler().postDelayed(() -> doubleBackToExitPressedOnce = false, 2000);
    }
}
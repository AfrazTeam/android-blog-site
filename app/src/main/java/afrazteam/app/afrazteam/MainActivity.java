package afrazteam.app.afrazteam;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.AnimationTypes;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        bindViews();
        fillSliderData();

    }

    private void fillSliderData() {
        List<SlideModel> imageList = new ArrayList<>();

        imageList.add(new SlideModel(R.drawable.img_slider3, "And people do that.", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.img_slider1, "The animal population decreased by 58 percent in 42 years.", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.img_slider2, "Elephants and tigers may become extinct.", ScaleTypes.FIT));

        imageSlider.setImageList(imageList);
        imageSlider.setSlideAnimation(AnimationTypes.BACKGROUND_TO_FOREGROUND);
        imageSlider.setAnimation(imageSlider.getAnimation());
    }

    private void bindViews() {
        imageSlider = findViewById(R.id.image_slider);
    }
}
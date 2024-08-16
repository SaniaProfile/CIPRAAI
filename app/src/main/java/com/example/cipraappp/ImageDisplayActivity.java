package com.example.cipraappp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ImageDisplayActivity extends AppCompatActivity {

    private ImageView displayImage;
    private TextView recommendationTitle;
    private TextView recommendationHeader;
    private TextView recommendationDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_display);

        displayImage = findViewById(R.id.display_image);
        recommendationTitle = findViewById(R.id.recommendation_title);
        recommendationHeader = findViewById(R.id.recommendation_header);
        recommendationDetails = findViewById(R.id.recommendation_details);


    }
}

package uem.dam.seg.pruebalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplasScreen extends AppCompatActivity {

    TextView tvAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splas_screen);

        tvAnimation = (TextView)findViewById(R.id.tvSplash);

        Animation translate = AnimationUtils.loadAnimation(this,R.anim.splash_screen);

        tvAnimation.startAnimation(translate);
    }
}

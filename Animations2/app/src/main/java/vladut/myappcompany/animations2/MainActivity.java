package vladut.myappcompany.animations2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {



    public void fade(View view){
        Log.i("Info", "Image pressed");

        ImageView bartImageview = findViewById(R.id.bartImageView);
        ImageView hommerImageview = findViewById(R.id.homerImageView);

        //bartImageview.animate().translationXBy(-1000).setDuration(2000);
        //bartImageview.animate().rotation(1800).alpha(0).setDuration(1000);
        bartImageview.animate().scaleX(0.5f).scaleY(0.5f).setDuration(1000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bartImageview = findViewById(R.id.bartImageView);
        //bartImageview.animate().translationXBy(-1000);
        bartImageview.setX(-1000);

        bartImageview.animate().translationXBy(1000).rotation(3600).setDuration(2000);
    }
}
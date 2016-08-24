package example.valdadyne.com.movielist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread bg = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent intent = new Intent(MainActivity.this, ListActivity.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        bg.start();
    }
}

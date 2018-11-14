package ortega.jazmin.com.big1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void MainMenu(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnBack) {
            i = new Intent(this, Startup.class);
            startActivity(i);
        }
    }
}

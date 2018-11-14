package ortega.jazmin.com.big1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Startup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
    }
    public void StartUp(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnStart) {
            i = new Intent(this, MainMenu.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.btnInfo) {
            i = new Intent(this, BigOnePage.class);
            startActivity(i);
        }else if (v.getId() == R.id.info) {
            i = new Intent(this, BigOnePage.class);
            startActivity(i);
        }
}
    }

package ortega.jazmin.com.big1;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Startup extends AppCompatActivity {
    Dialog myDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
        myDialog = new Dialog(this);
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
    public void ShowPopup(View v) {
        TextView closebtn;
        myDialog.setContentView(R.layout.activity_info_page);
        closebtn =(TextView) myDialog.findViewById(R.id.closebtn);
        closebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    }

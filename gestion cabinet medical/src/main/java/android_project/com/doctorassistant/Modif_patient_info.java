package android_project.com.doctorassistant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Modif_patient_info extends Activity implements View.OnClickListener{


    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modif_patient);



        b1 = (Button)findViewById(R.id.savechanges);
        b1.setOnClickListener(this);
        b1 = (Button)findViewById(R.id.back_home2);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.savechanges) {
            Intent i = new Intent(Modif_patient_info.this, Patient_Info.class);
            startActivity(i);
        }
        if (v.getId() == R.id.back_home2) {
            Intent i = new Intent(Modif_patient_info.this, homepage.class);
            startActivity(i);
        }

    }
}

package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HutangDhFormSummary extends AppCompatActivity {

    //please delete this activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.hutang_dh_form_summary);
    }

    public void toHutangDhForm(View view) {
        Intent intent = new Intent(this, HutangDhForm.class);
        startActivity(intent);
    }


}

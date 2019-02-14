package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PosKnCari extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.pos_kn_cari);
    }

    public void toPosKn(View view) {
        Intent intent = new Intent(this, PosKn.class);
        startActivity(intent);
    }

}

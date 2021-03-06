package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PosNppPelanggan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.pos_npp_pelanggan);
    }

    public void toPosNpp(View view) {
        Intent intent = new Intent(this, PosNpp.class);
        startActivity(intent);
    }

    public void toPosNppPelangganTambah(View view) {
        Intent intent = new Intent(this, PosNppPelangganTambah.class);
        startActivity(intent);
    }
}

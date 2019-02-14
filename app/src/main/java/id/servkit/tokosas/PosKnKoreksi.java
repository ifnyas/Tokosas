package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PosKnKoreksi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.pos_kn_koreksi);
    }

    public void toPosKn(View view) {
        Intent intent = new Intent(this, PosKn.class);
        startActivity(intent);
    }

    public void toPosKnKoreksiPembayaran(View view) {
        Intent intent = new Intent(this, PosNppPembayaran.class);
        startActivity(intent);
    }

    public void toPosKnKoreksiList(View view) {
        Intent intent = new Intent(this, PosKnKoreksiList.class);
        startActivity(intent);
    }

}

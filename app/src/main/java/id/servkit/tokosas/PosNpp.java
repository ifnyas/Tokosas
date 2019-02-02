package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PosNpp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.pos_npp);
    }

    public void toPosNppList(View view) {
        Intent intent = new Intent(this, PosNppList.class);
        startActivity(intent);
    }

    public void toPosNppPembayaran(View view) {
        Intent intent = new Intent(this, PosNppPembayaran.class);
        startActivity(intent);
    }

    public void toPosNppPelanggan(View view) {
        Intent intent = new Intent(this, PosNppPelanggan.class);
        startActivity(intent);

    }

    public void toPosNppSalesman(View view) {
        Intent intent = new Intent(this, PosNppSalesman.class);
        startActivity(intent);
    }

    public void toMainMenu(View view) {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }
}

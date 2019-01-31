package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PosKn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.pos_kn);
    }

    public void toKpCari(View view) {
        Intent intent = new Intent(this, PosKnCari.class);
        startActivity(intent);
    }

    public void toMainMenu(View view) {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }

    public void toKpKoreksi(View view) {
        Intent intent = new Intent(this, PosKnKoreksi.class);
        startActivity(intent);
    }
}

package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PiutangSp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.piutang_sp);
    }

    public void toMainMenu(View view) {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }

    public void toPiutangSpLihat(View view) {
        Intent intent = new Intent(this, PiutangSpLihat.class);
        startActivity(intent);
    }

    public void toPiutangSpCari(View view) {
        Intent intent = new Intent(this, PiutangSpCari.class);
        startActivity(intent);
    }
}

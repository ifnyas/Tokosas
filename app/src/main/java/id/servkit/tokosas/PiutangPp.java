package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PiutangPp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.piutang_pp);
    }

    public void toMainMenu(View view) {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }

    public void toPiutangPpForm(View view) {
        Intent intent = new Intent(this, PiutangPpForm.class);
        startActivity(intent);
    }

    public void toPiutangPpLihat(View view) {
        Intent intent = new Intent(this, PiutangPpLihat.class);
        startActivity(intent);
    }

    public void toPiutangPpCari(View view) {
        Intent intent = new Intent(this, PiutangPpCari.class);
        startActivity(intent);
    }
}

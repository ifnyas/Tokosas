package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HutangPh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.hutang_ph);
    }

    public void toMainMenu(View view) {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }

    public void toHutangPhForm(View view) {
        Intent intent = new Intent(this, HutangPhForm.class);
        startActivity(intent);
    }

    public void toHutangPhCari(View view) {
        Intent intent = new Intent(this, HutangPhCari.class);
        startActivity(intent);
    }
}

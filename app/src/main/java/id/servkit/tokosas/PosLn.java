package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PosLn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.pos_ln);
    }

    public void toNppForm(View view) {
        Intent intent = new Intent(this, PosNppForm.class);
        startActivity(intent);
    }

    public void toLnCari(View view) {
        Intent intent = new Intent(this, PosLnCari.class);
        startActivity(intent);
    }

    public void toMainMenu(View view) {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }
}

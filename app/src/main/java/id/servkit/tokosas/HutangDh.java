package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HutangDh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.hutang_dh);
    }

    public void toMainMenu(View view) {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }

    public void toHutangDhForm(View view) {
        Intent intent = new Intent(this, HutangDhForm.class);
        startActivity(intent);
    }

    public void toHutangDhCari(View view) {
        Intent intent = new Intent(this, HutangDhCari.class);
        startActivity(intent);
    }
}

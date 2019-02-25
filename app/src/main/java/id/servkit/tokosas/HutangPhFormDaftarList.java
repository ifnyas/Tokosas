package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HutangPhFormDaftarList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.hutang_ph_form_daftar_list);
    }

    public void toHutangPhFormDaftar(View view) {
        Intent intent = new Intent(this, HutangPhFormDaftar.class);
        startActivity(intent);
    }
}

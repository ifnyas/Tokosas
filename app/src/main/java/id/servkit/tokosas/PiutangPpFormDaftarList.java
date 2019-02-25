package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PiutangPpFormDaftarList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.piutang_pp_form_daftar_list);
    }

    public void toPiutangPpFormDaftar(View view) {
        Intent intent = new Intent(this, PiutangPpFormDaftar.class);
        startActivity(intent);
    }
}

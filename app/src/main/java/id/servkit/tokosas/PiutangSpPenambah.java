package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PiutangSpPenambah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.piutang_sp_penambah);
    }

    public void toPiutangSp(View view) {
        Intent intent = new Intent(this, PiutangSp.class);
        startActivity(intent);
    }
}

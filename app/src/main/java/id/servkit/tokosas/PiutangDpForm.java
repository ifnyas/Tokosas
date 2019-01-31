package id.servkit.tokosas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class PiutangDpForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.piutang_dp_form);
    }
}

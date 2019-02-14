package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PosLnLihat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pos_ln_lihat);
    }

    public void toPosLn(View view) {
        Intent intent = new Intent(this, PosLn.class);
        startActivity(intent);
    }
}

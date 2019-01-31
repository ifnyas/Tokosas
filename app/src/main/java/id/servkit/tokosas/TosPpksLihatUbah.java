package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TosPpksLihatUbah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.tos_ppks_lihat_ubah);
    }

    public void toTosPpksLihat(View view) {
        Intent intent = new Intent(this, TosPpksLihat.class);
        startActivity(intent);
    }
}

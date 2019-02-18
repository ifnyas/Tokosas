package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HutangPhFormDaftar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hutang_ph_form_daftar);
    }

    public void toHutangPhForm(View view) {
        Intent intent = new Intent(this, HutangPhForm.class);
        startActivity(intent);
    }

    public void toHutangPhFormDaftarList(View view) {
        Intent intent = new Intent(this, HutangPhFormDaftarList.class);
        startActivity(intent);
    }
}

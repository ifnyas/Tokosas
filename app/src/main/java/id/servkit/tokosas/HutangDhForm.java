package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HutangDhForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.hutang_dh_form);
    }

    public void toHutangDh(View view) {
        Intent intent = new Intent(this, HutangDh.class);
        startActivity(intent);
    }

    public void toHutangDhFormList(View view) {
        Intent intent = new Intent(this, HutangDhFormList.class);
        startActivity(intent);
    }

    public void toHutangDhFormSummary(View view) {
        // setup the alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Summary Pengurangan Hutang");
        builder.setMessage(
                "● Default Valuta: \n\n"
                + "● Nilai Nota: \n\n"
                + "● Nilai Tambahan: \n\n"
                + "● Total Nilai: \n\n"
        );

        // add a button
        builder.setPositiveButton("Kembali", null);

        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}

package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HutangPhForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.hutang_ph_form);
    }

    public void toHutangPh(View view) {
        Intent intent = new Intent(this, HutangPh.class);
        startActivity(intent);
    }

    public void toHutangPhFormDaftar(View view) {
        Intent intent = new Intent(this, HutangPhFormDaftar.class);
        startActivity(intent);
    }

    public void toHutangPhFormPembayaran(View view) {
        Intent intent = new Intent(this, HutangPhFormPembayaran.class);
        startActivity(intent);
    }

    public void toHutangPhFormSummary(View view) {
        // setup the alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Summary Pelunasan Hutang");
        builder.setMessage(
                "● Default Valuta: \n\n"
                        + "● Nilai Hutang: \n\n"
                        + "● Nominal Hutang: \n\n"
                        + "● Sisa Hutang: \n\n"
                        + "● Nominal Pelunasan Kas/Bank: \n\n"
                        + "● Nominal Pelunasan Dokumen: \n\n"
                        + "● Total Pelunasan: \n\n"
        );

        // add a button
        builder.setPositiveButton("Kembali", null);

        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}

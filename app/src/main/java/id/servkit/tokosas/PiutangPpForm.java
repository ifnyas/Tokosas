package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PiutangPpForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.piutang_pp_form);
    }

    public void toPiutangPp(View view) {
        Intent intent = new Intent(this, PiutangPp.class);
        startActivity(intent);
    }

    public void toPiutangPpFormDaftar(View view) {
        Intent intent = new Intent(this, HutangPhFormDaftar.class);
        startActivity(intent);
    }

    public void toPiutangPpFormPembayaran(View view) {
        Intent intent = new Intent(this, HutangPhFormPembayaran.class);
        startActivity(intent);
    }

    public void toPiutangPpFormSummary(View view) {
        // setup the alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Summary Pelunasan Piutang");
        builder.setMessage(
                "● Default Valuta: \n\n"
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

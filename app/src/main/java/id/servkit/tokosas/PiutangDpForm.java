package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PiutangDpForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.piutang_dp_form);
    }

    public void toPiutangDp(View view) {
        Intent intent = new Intent(this, PiutangDp.class);
        startActivity(intent);
    }

    public void toPiutangDpFormList(View view) {
        Intent intent = new Intent(this, PiutangDpFormList.class);
        startActivity(intent);
    }

    public void toPiutangDpFormSummary(View view) {
        // setup the alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Summary Pengurangan Hutang");
        builder.setMessage(
                "Default Valuta: \n\n"
                        + "Nilai Nota: \n\n"
                        + "Nilai Tambahan: \n\n"
                        + "Total Nilai: \n\n"
        );

        // add a button
        builder.setPositiveButton("Kembali", null);

        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}

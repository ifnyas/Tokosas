package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TosRbForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.tos_rb_form);
    }

    public void toTosRbFormSummary(View view) {
        // setup the alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Summary Retur Beli");
        builder.setMessage(
                "Jumlah Produk : \n\n"
                        + "Total Qty Barang: \n\n"
                        + "Total Nilai: \n\n"
        );

        // add a button
        builder.setPositiveButton("Kembali", null);

        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void toTosRb(View view) {
        Intent intent = new Intent(this, TosRb.class);
        startActivity(intent);
    }


}

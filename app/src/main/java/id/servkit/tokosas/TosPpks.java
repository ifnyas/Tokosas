package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TosPpks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.tos_ppks);
    }

    public void toTosPpksCari(View view) {
        final AlertDialog dialogBuilder = new AlertDialog.Builder(this).create();
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.tos_ppks_cari, null);

        Button button1 = dialogView.findViewById(R.id.buttonSubmit);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // DO SOMETHINGS
                dialogBuilder.dismiss();
            }
        });

        dialogBuilder.setView(dialogView);
        dialogBuilder.show();
    }

    public void toMainMenu(View view) {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }

    public void toTosPpksForm(View view) {
        Intent intent = new Intent(this, TosPpksForm.class);
        startActivity(intent);
    }

    public void toTosPpksLihat(View view) {
        Intent intent = new Intent(this, TosPpksLihat.class);
        startActivity(intent);
    }

    public void salin(View view) {
        Toast.makeText(getBaseContext(), "Data telah disalin", Toast.LENGTH_SHORT).show();
    }
}

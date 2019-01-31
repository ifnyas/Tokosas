package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class TosOp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.tos_op);
    }

    public void toTosOpCari(View view) {
        Intent intent = new Intent(this, TosOpCari.class);
        startActivity(intent);
    }

    public void toMainMenu(View view) {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }

    public void toTosOpForm(View view) {
        Intent intent = new Intent(this, TosOpForm.class);
        startActivity(intent);
    }

    public void toTosOpLihat(View view) {
        Intent intent = new Intent(this, TosOpLihat.class);
        startActivity(intent);
    }

    public void salin(View view) {
        Toast.makeText(getBaseContext(), "Data telah disalin", Toast.LENGTH_SHORT).show();
    }
}

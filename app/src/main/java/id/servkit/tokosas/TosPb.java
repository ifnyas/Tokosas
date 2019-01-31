package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class TosPb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.tos_pb);
    }

    public void toTosPbCari(View view) {
        Intent intent = new Intent(this, TosPbCari.class);
        startActivity(intent);
    }

    public void toMainMenu(View view) {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }

    public void toTosPbForm(View view) {
        Intent intent = new Intent(this, TosPbForm.class);
        startActivity(intent);
    }

    public void toTosPbLihat(View view) {
        Intent intent = new Intent(this, TosPbLihat.class);
        startActivity(intent);
    }

    public void salin(View view) {
        Toast.makeText(getBaseContext(), "Data telah disalin", Toast.LENGTH_SHORT).show();
    }

}

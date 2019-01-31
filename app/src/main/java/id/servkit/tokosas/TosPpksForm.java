package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TosPpksForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.tos_ppks_form);
    }

    public void toTosPpks(View view) {
        Intent intent = new Intent(this, TosPpks.class);
        startActivity(intent);
    }

    public void toPpksList(View view) {
        Intent intent = new Intent(this, TosPpksList.class);
        startActivity(intent);
    }

    public void toPpksLookup(View view) {
        Intent intent = new Intent(this, TosPpksLookup.class);
        startActivity(intent);
    }
}

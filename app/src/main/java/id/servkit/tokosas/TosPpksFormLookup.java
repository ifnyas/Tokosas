package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TosPpksFormLookup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.tos_ppks_form_lookup);
    }

    public void toPpksForm(View view) {
        Intent intent = new Intent(this, TosPpksForm.class);
        startActivity(intent);
    }

    public void toPpksResult(View view) {
        Intent intent = new Intent(this, TosPpksResult.class);
        startActivity(intent);
    }
}

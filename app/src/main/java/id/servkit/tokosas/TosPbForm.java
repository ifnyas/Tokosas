package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TosPbForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.tos_pb_form);
    }

    public void toTosPb(View view) {
        Intent intent = new Intent(this, TosPb.class);
        startActivity(intent);
    }

    public void toTosPbFormSummary(View view) {
        Intent intent = new Intent(this, TosPbFormSummary.class);
        startActivity(intent);
    }

    public void toTosPbFormLookup(View view) {
        Intent intent = new Intent(this, TosPpksLookup.class);
        startActivity(intent);
    }

    public void toTosPbFormList(View view) {
        Intent intent = new Intent(this, TosPbFormList.class);
        startActivity(intent);
    }
}

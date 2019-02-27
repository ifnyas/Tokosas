package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TosOpForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.tos_op_form);
    }

    public void toTosOp(View view) {
        Intent intent = new Intent(this, TosOp.class);
        startActivity(intent);
    }

    public void toTosOpFormSummary(View view) {
        Intent intent = new Intent(this, TosOpFormSummary.class);
        startActivity(intent);
    }

    public void toTosOpFormLookup(View view) {
        Intent intent = new Intent(this, TosPpksFormLookup.class);
        startActivity(intent);
    }

    public void toTosOpFormList(View view) {
        Intent intent = new Intent(this, TosOpFormList.class);
        startActivity(intent);
    }
}

package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MemberSnk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.member_snk);
    }

    /*intent to go to My Account */
    public void toMainMember(View view) {
        Intent intent = new Intent(this, MainMember.class);
        startActivity(intent);
    }
}

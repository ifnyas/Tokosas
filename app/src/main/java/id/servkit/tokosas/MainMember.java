package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainMember extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.main_member);
    }

    /*intent for back button */
    public void toMainActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    /*intent for MemberPart Button */
    public void toMemberPart(View view) {
        Intent intent = new Intent(this, MemberPart.class);
        startActivity(intent);
    }

    /*intent for MemberSnk Button */
    public void toMemberSnk(View view) {
        Intent intent = new Intent(this, MemberSnk.class);
        startActivity(intent);
    }
}

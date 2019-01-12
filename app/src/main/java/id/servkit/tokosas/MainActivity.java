package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
    }

    /*intent to go to Main Menu */
    public void toMainMenu(View view) {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }

    /*intent to go to My Account */
    public void toMainMember(View view) {
        Intent intent = new Intent(this, MainMember.class);
        startActivity(intent);
    }

    /*intent to go to Main Member */
    public void toMyAccount(View view) {
        Intent intent = new Intent(this, MyAccount.class);
        startActivity(intent);
    }
}

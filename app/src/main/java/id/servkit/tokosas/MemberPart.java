package id.servkit.tokosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MemberPart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.member_part);
    }

    /*intent to go to My Account */
    public void toMainMember(View view) {
        Intent intent = new Intent(this, Member.class);
        startActivity(intent);
    }

    /*intent for PartP button */
    public void toPartP(View view) {

        // setup the alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Benefit P");
        builder.setMessage("Setiap orang yang sudah terdaftar sebagai member PART Station akan "
                + "mendapatkan potongan langsung sebesar:\n\n"
                + "● Suku Cadang Merk SAS - 20%\n\n"
                + "● Jasa Servis - 15%\n\n"
                + "● Suku Cadang Genuine - 2% (dari HET)"
        );

        // add a button
        builder.setPositiveButton("Kembali", null);

        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();

    }

    /*intent for PartA button */
    public void toPartA(View view) {

        // setup the alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Benefit A");
        builder.setMessage(
                "Bonus langsung Rp25.000,- untuk member PART Station yang berhasil merekrut " +
                        "member lainnya untuk PART Station dengan minimum pembelanjaan " +
                        "Rp100.000,- di transaksi pertama (setelah potongan harga)\n\n"
                        + "Bonus akan dibayarkan di setiap akhir bulan setelah verifikasi member valid."
        );

        // add a button
        builder.setPositiveButton("Kembali", null);

        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();

    }

    /*intent for PartR button */
    public void toPartR(View view) {

        // setup the alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Benefit R");
        builder.setMessage(
                "Mendapatkan bonus tambahan 5% dari setiap member dibawahnya (min. 2 orang) dengan " +
                        "syarat member dibawahnya min. bertransaksi Rp250.000,- per bulan per member."
        );

        // add a button
        builder.setPositiveButton("Kembali", null);

        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();

    }

    /*intent for PartT button */
    public void toPartT(View view) {

        // setup the alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Benefit T");
        builder.setMessage(
                "Dalam 1 tahun, tersedia hadiah 5 Paket Wisata Religi (@ senilai Rp30jt) dan 5 Paket " +
                        "Wisata Keluarga (@ senilai Rp15jt). Hadiah diberikan kepada member dengan" +
                        "transaksi terbesar yang memenuhi syarat:\n\n"
                        + "● Paket Wisata Religi - min. penjualan 300jt/tahun dan memiliki 12 member.\n\n"
                        + "● Paket Wisata Keluarga - min. penjualan 150jt/tahun dan memiliki 6 member. "
        );

        // add a button
        builder.setPositiveButton("Kembali", null);

        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();

    }
}

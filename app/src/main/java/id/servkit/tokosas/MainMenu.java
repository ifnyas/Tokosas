package id.servkit.tokosas;

import android.app.ExpandableListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.SimpleExpandableListAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainMenu extends ExpandableListActivity {

    ExpandableListView expand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        /* create list main menu */

        List<Map<String, String>> groupData = new ArrayList<>();
        List<List<Map<String, String>>> childData = new ArrayList<>();
        // TODO Bold parent menu

        /* ******************** Start Group  ********************* */
        Map<String, String> curgroupMap1 = new HashMap<>();
        groupData.add(curgroupMap1);
        curgroupMap1.put("parent", "TOS");

        List<Map<String, String>> children1 = new ArrayList<>();
        /* *** ChildData ***/
        Map<String, String> curChildMap11 = new HashMap<>();
        children1.add(curChildMap11);
        curChildMap11.put("child", "Permintaan Pembelian Ke SAS");

        /* *** ChildData ***/
        Map<String, String> curChildMap12 = new HashMap<>();
        children1.add(curChildMap12);
        curChildMap12.put("child", "Penawaran Dari SAS");

        /* *** ChildData ***/
        Map<String, String> curChildMap13 = new HashMap<>();
        children1.add(curChildMap13);
        curChildMap13.put("child", "Order Pembelian");

        /* ***ChildData ***/
        Map<String, String> curChildMap14 = new HashMap<>();
        children1.add(curChildMap14);
        curChildMap14.put("child", "Penerimaan Barang");

        /* ***ChildData ***/
        Map<String, String> curChildMap15 = new HashMap<>();
        children1.add(curChildMap15);
        curChildMap15.put("child", "Monitoring Order Pembelian");

        /* *** ChildData ***/
        Map<String, String> curChildMap16 = new HashMap<>();
        children1.add(curChildMap16);
        curChildMap16.put("child", "Koreksi Penerimaan Barang");

        /* ***ChildData ***/
        Map<String, String> curChildMap17 = new HashMap<>();
        children1.add(curChildMap17);
        curChildMap17.put("child", "Permohonan Retur Barang");

        /* ***ChildData ***/
        Map<String, String> curChildMap18 = new HashMap<>();
        children1.add(curChildMap18);
        curChildMap18.put("child", "Retur Beli");

        childData.add(children1);
        /* *************************End Group **************************/

        /* ******************** Start Group  ********************* */
        Map<String, String> curgroupMap2 = new HashMap<>();
        groupData.add(curgroupMap2);
        curgroupMap2.put("parent", "POS");
        List<Map<String, String>> children2 = new ArrayList<>();

        /* *** ChildData ***/
        Map<String, String> curChildMap21 = new HashMap<>();
        children2.add(curChildMap21);
        curChildMap21.put("child", "Nota Penjualan Produk");

        /* *** ChildData ***/
        Map<String, String> curChildMap22 = new HashMap<>();
        children2.add(curChildMap22);
        curChildMap22.put("child", "Nota Penjualan Jasa");

        /* *** ChildData ***/
        Map<String, String> curChildMap23 = new HashMap<>();
        children2.add(curChildMap23);
        curChildMap23.put("child", "List Nota");

        /* *** ChildData ***/
        Map<String, String> curChildMap24 = new HashMap<>();
        children2.add(curChildMap24);
        curChildMap24.put("child", "Koreksi Nota");

        childData.add(children2);
        /* *************************End Group **************************/

        /* ******************** Start Group  ********************* */
        Map<String, String> curgroupMap3 = new HashMap<>();
        groupData.add(curgroupMap3);
        curgroupMap3.put("parent", "Hutang");
        List<Map<String, String>> children3 = new ArrayList<>();

        /* *** ChildData ***/
        Map<String, String> curChildMap31 = new HashMap<>();
        children3.add(curChildMap31);
        curChildMap31.put("child", "Daftar Hutang");

        /* *** ChildData ***/
        Map<String, String> curChildMap32 = new HashMap<>();
        children3.add(curChildMap32);
        curChildMap32.put("child", "Saldo Hutang");

        /* *** ChildData ***/
        Map<String, String> curChildMap33 = new HashMap<>();
        children3.add(curChildMap33);
        curChildMap33.put("child", "Pelunasan Hutang");

        childData.add(children3);
        /* *************************End Group **************************/

        /* ******************** Start Group  ********************* */
        Map<String, String> curgroupMap4 = new HashMap<>();
        groupData.add(curgroupMap4);
        curgroupMap4.put("parent", "Piutang");
        List<Map<String, String>> children4 = new ArrayList<>();

        /* *** ChildData ***/
        Map<String, String> curChildMap41 = new HashMap<>();
        children4.add(curChildMap41);
        curChildMap41.put("child", "Daftar Piutang");

        /* *** ChildData ***/
        Map<String, String> curChildMap42 = new HashMap<>();
        children4.add(curChildMap42);
        curChildMap42.put("child", "Saldo Piutang");

        /* *** ChildData ***/
        Map<String, String> curChildMap43 = new HashMap<>();
        children4.add(curChildMap43);
        curChildMap43.put("child", "Pelunasan Piutang");

        childData.add(children4);
        /* *************************End Group **************************/

        /* ******************** Start Group  ********************* */
        Map<String, String> curgroupMap5 = new HashMap<>();
        groupData.add(curgroupMap5);
        curgroupMap5.put("parent", "Laporan");
        List<Map<String, String>> children5 = new ArrayList<>();

        /* *** ChildData ***/
        Map<String, String> curChildMap51 = new HashMap<>();
        children5.add(curChildMap51);
        curChildMap51.put("child", "Laporan Rekap / Kartu Hutang");

        /* *** ChildData ***/
        Map<String, String> curChildMap52 = new HashMap<>();
        children5.add(curChildMap52);
        curChildMap52.put("child", "Laporan Rekap / Kartu Piutang");

        /* *** ChildData ***/
        Map<String, String> curChildMap53 = new HashMap<>();
        children5.add(curChildMap53);
        curChildMap53.put("child", "Laporan Rekap / Kartu Stok");

        /* *** ChildData ***/
        Map<String, String> curChildMap54 = new HashMap<>();
        children5.add(curChildMap54);
        curChildMap54.put("child", "Laporan Penjualan");

//        /* *** ChildData ***/
//        Map<String, String> curChildMap54 = new HashMap<>();
//        children5.add(curChildMap54);
//        curChildMap54.put("child", "Laporan Kartu Stok");

//        /* *** ChildData ***/
//        Map<String, String> curChildMap55 = new HashMap<>();
//        children5.add(curChildMap55);
//        curChildMap55.put("child", "Laporan Penjualan Produk");
//
//        /* *** ChildData ***/
//        Map<String, String> curChildMap56 = new HashMap<>();
//        children5.add(curChildMap56);
//        curChildMap56.put("child", "Laporan Penjualan Jasa");

        childData.add(children5);
        /* *************************End Group **************************/

        ExpandableListAdapter mAdapter = new SimpleExpandableListAdapter(
                this,
                groupData,
                android.R.layout.simple_expandable_list_item_1,
                new String[]{"parent"},
                new int[]{android.R.id.text1, android.R.id.text2},
                childData,
                android.R.layout.simple_expandable_list_item_2,
                new String[]{"child"},
                new int[]{android.R.id.text1}
        );
        setListAdapter(mAdapter);

        expand = getExpandableListView();

        expand.setOnChildClickListener(new OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {

                switch (groupPosition) {
                    case 0:
                        switch (childPosition) {
                            case 0:
                                Intent intent00 = new Intent(v.getContext(), TosPpks.class);
                                startActivity(intent00);
                                break;
                            case 1:
                                Intent intent01 = new Intent(v.getContext(), TosPwks.class);
                                startActivity(intent01);
                                break;
                            case 2:
                                Intent intent02 = new Intent(v.getContext(), TosOp.class);
                                startActivity(intent02);
                                break;
                            case 3:
                                Intent intent03 = new Intent(v.getContext(), TosPb.class);
                                startActivity(intent03);
                                break;
                            case 4:
                                Intent intent04 = new Intent(v.getContext(), TosMop.class);
                                startActivity(intent04);
                                break;
                            case 5:
                                Intent intent05 = new Intent(v.getContext(), TosKpb.class);
                                startActivity(intent05);
                                break;
                            case 6:
                                Intent intent06 = new Intent(v.getContext(), TosPrb.class);
                                startActivity(intent06);
                                break;
                            case 7:
                                Intent intent07 = new Intent(v.getContext(), TosRb.class);
                                startActivity(intent07);
                                break;
                        }
                        break;
                    case 1:
                        switch (childPosition) {
                            case 0:
                                Intent intent00 = new Intent(v.getContext(), PosNpp.class);
                                startActivity(intent00);
                                break;
                            case 1:
                                Toast.makeText(getBaseContext(), "NPJ",
                                        Toast.LENGTH_SHORT).show();
                                break;
                            case 2:
                                Intent intent02 = new Intent(v.getContext(), PosLn.class);
                                startActivity(intent02);
                                break;
                            case 3:
                                Intent intent03 = new Intent(v.getContext(), PosKn.class);
                                startActivity(intent03);
                                break;
                        }
                        break;
                    case 2:
                        switch (childPosition) {
                            case 0:
                                Intent intent00 = new Intent(v.getContext(), HutangDh.class);
                                startActivity(intent00);
                                break;
                            case 1:
                                Intent intent01 = new Intent(v.getContext(), HutangSh.class);
                                startActivity(intent01);
                                break;
                            case 2:
                                Intent intent02 = new Intent(v.getContext(), HutangPh.class);
                                startActivity(intent02);
                                break;
                        }
                        break;
                    case 3:
                        switch (childPosition) {
                            case 0:
                                Intent intent00 = new Intent(v.getContext(), PiutangDp.class);
                                startActivity(intent00);
                                break;
                            case 1:
                                Intent intent01 = new Intent(v.getContext(), PiutangSp.class);
                                startActivity(intent01);
                                break;
                            case 2:
                                Intent intent02 = new Intent(v.getContext(), PiutangPp.class);
                                startActivity(intent02);
                                break;
                        }
                        break;
                    case 4:
                        switch (childPosition) {
                            case 0:
                                Intent intent00 = new Intent(v.getContext(), LaporanHutang.class);
                                startActivity(intent00);
                                break;
                            case 1:
                                Intent intent01 = new Intent(v.getContext(), LaporanPiutang.class);
                                startActivity(intent01);
                                break;
                            case 2:
                                Intent intent02 = new Intent(v.getContext(), LaporanStok.class);
                                startActivity(intent02);
                                break;
                            case 3:
                                Intent intent03 = new Intent(v.getContext(), LaporanPenjualan.class);
                                startActivity(intent03);
                                break;
                        }
                        break;
                }

                return false;
            }
        });
    }

    /*intent for back button */
    public void toMainActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
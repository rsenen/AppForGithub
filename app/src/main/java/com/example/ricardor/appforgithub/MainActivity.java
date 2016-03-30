package com.example.ricardor.appforgithub;

import android.app.Activity;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;


public class MainActivity extends Activity {

    public ListView lista;
    public RelativeLayout panelSuperior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //---------Inicializo el listview
        lista = (ListView) findViewById(R.id.listviewOne);
        panelSuperior = (RelativeLayout) findViewById(R.id.panelSup);
        //---------contenido para el listview
        String[] values = new String[]{"Red", "Blue","Teal","Pink","Green","Yellow"};
        //---------creo un array para el listview
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);
        //-------ingreso arraylist al list view
        lista.setAdapter(adapter);
        //--------Accion al tocar un elemento de la lista
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // ListView Clicked item index
                int itemPosition = position;
                switch (itemPosition) {
                    case 0:
                        panelSuperior.setBackgroundColor(Color.parseColor("#d32f2f"));
                        break;
                    case 1:
                        panelSuperior.setBackgroundColor(Color.parseColor("#1976d2"));
                        break;
                    case 2:
                        panelSuperior.setBackgroundColor(Color.parseColor("#00796b"));
                        break;
                    case 3:
                        panelSuperior.setBackgroundColor(Color.parseColor("#c2185b"));
                        break;
                    case 4:
                        panelSuperior.setBackgroundColor(Color.parseColor("#4caf50"));
                        break;
                    case 5:
                        panelSuperior.setBackgroundColor(Color.parseColor("#cddc39"));
                        break;
                    default:
                        break;
                }
            }
        });
    }
}

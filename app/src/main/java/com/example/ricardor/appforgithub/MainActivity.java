package com.example.ricardor.appforgithub;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {

    public ListView lista ;
    public RelativeLayout panelSuperior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //---------Inicializo el listview
        lista = (ListView) findViewById(R.id.listviewOne);
        panelSuperior = (RelativeLayout) findViewById(R.id.panelSuperiorRelativeLayout);
        //---------contenido para el listview
        String[] values = new String[] { "Red", "Blue"};
        //---------creo un array para el listview
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, android.R.id.text1, values);
        //-------ingreso arraylist al list view
        //lista.setAdapter(adapter);
        //--------Accion al tocar un elemento de la lista
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {

                // ListView Clicked item index
                int itemPosition = position;
                switch (itemPosition){
                    case 0:
                        panelSuperior.setBackgroundResource(R.color.red);
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    default:
                        break;
                }
            }
        });
    }
}

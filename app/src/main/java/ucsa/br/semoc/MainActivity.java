package ucsa.br.semoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listview);

        List<String> evento = new ArrayList<>();

        evento.add("Apresentação");
        evento.add("Projeto");
        evento.add("Eixo Temático");
        evento.add("Programação");
        evento.add("Inscrição");
        evento.add("Cronograma");
        evento.add("Contatos");
        evento.add("Certificado");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,evento);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    startActivity(new Intent(MainActivity.this, ApresentacaoActivity2.class));
                } else if (i == 1) {
                    startActivity(new Intent(MainActivity.this, ProjetoActivity3.class));
                } else if (i == 2) {
                    startActivity(new Intent(MainActivity.this, EixoTematicoActivity4.class));
                } else if (i == 3) {
                    startActivity(new Intent(MainActivity.this, ProgramacaoActivity5.class));
                } else if (i == 4) {
                    startActivity(new Intent(MainActivity.this, IncricaoActivity6.class));
                } else if (i == 5) {
                    startActivity(new Intent(MainActivity.this, CronogramaActivity7.class));
                } else if (i == 6) {
                    startActivity(new Intent(MainActivity.this, ContatosActivity8.class));
                } else {
                    startActivity(new Intent(MainActivity.this, CertificadoActivity9.class));
                }
            }
        });



    }
}
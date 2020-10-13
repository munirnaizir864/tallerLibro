package co.edu.uac.munirN.libros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import co.edu.uac.munirN.libros.Adapter.CustomAdapter;
import co.edu.uac.munirN.libros.Model.Libro;

public class ListaLibros extends AppCompatActivity {

    ListView listapaises;
    List<Libro> libros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_paises);

        listapaises = findViewById(R.id.listaPaises);
        CustomAdapter adapter = new CustomAdapter(this, GetData());
        listapaises.setAdapter(adapter);

        listapaises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Libro libro = libros.get(position);
                Toast.makeText(getApplicationContext(), "Libro : " + (libro.autor),Toast.LENGTH_LONG).show();
            }
        });

    }

    private List<Libro> GetData() {
        libros = new ArrayList<>();
        libros.add(new Libro("100 años de soledad"," Gabriel gracia marquez","N/A"));
        libros.add(new Libro("No es cuestion de leche es cuestion de actitud","Raul Rodriguez","Septima edicion"));
        libros.add(new Libro("El vendedor mas grande del mundo","OG Mandino","Cuarta edicion "));
        libros.add(new Libro("El Zahir","Paulo Coello","primera edicion "));
        libros.add(new Libro("El calendario obeso","Victor Tennynson","Segunda edicion "));

        return libros;
    }


}

package co.edu.uac.munirN.libros.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import co.edu.uac.munirN.libros.Model.Libro;
import co.edu.uac.munirN.libros.R;

public class CustomAdapter extends BaseAdapter {

    Context context;
    List<Libro> libros;

    public CustomAdapter(Context context, List<Libro> libros) {
        this.context = context;
        this.libros = libros;
    }

    @Override
    public int getCount() {
        return libros.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View vista, ViewGroup viewGroup) {

        TextView txtLib;
        TextView txtEdi;
        TextView txtAu;

        Libro libro = libros.get(i);
        if (vista == null)
            vista = LayoutInflater.from(context).inflate(R.layout.layout_lista_libros, null);

        txtAu = vista.findViewById(R.id.txtAu);
        txtLib = vista.findViewById(R.id.txtLib);
        txtEdi = vista.findViewById(R.id.txtEdi);

        txtAu.setText(libro.autor);
        txtLib.setText(libro.libro);
        txtEdi.setText(libro.edicicion);

        return vista;
    }
}

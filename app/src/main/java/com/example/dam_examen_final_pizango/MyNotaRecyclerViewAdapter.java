package com.example.dam_examen_final_pizango;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.dam_examen_final_pizango.databinding.FragmentItemBinding;
import java.util.List;

/**
 * {@link RecyclerView.Adapter} que puede mostrar elementos de tipo {@link Nota}.
 */
public class MyNotaRecyclerViewAdapter extends RecyclerView.Adapter<MyNotaRecyclerViewAdapter.MyViewHolder> {

    private final List<Nota> mValues;

    // Constructor
    public MyNotaRecyclerViewAdapter(List<Nota> items) {
        this.mValues = items;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Inflar el layout para cada item
        return new MyViewHolder(FragmentItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        // Asignar valores a las vistas
        Nota currentNota = mValues.get(position);
        holder.mIdView.setText(currentNota.getId());  // Usando el getter para obtener el id
        holder.mContentView.setText(currentNota.getContenido());  // Usando el getter para obtener el contenido
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    // MyViewHolder es el que contiene las vistas, sin necesidad de una clase ViewHolder separada
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public final TextView mIdView;
        public final TextView mContentView;

        public MyViewHolder(FragmentItemBinding binding) {
            super(binding.getRoot());
            mIdView = binding.itemNumber;   // Asegúrate que "itemNumber" existe en tu XML
            mContentView = binding.content; // Asegúrate que "content" existe en tu XML
        }
    }
}

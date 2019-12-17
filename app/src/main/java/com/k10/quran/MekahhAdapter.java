package com.k10.quran;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class MekahhAdapter extends RecyclerView.Adapter<MekahhAdapter.ViewHolder> {

    private Context context;
    private List<Mekahh> list;

    public MekahhAdapter(Context context, List<Mekahh> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_mekah, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Mekahh obj = list.get(position);
        holder.nomor.setText(obj.getNomor()+". ");
        holder.nama.setText(obj.getNama());
        holder.arti.setText(obj.getArti());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView nomor;
        private TextView nama;
        private TextView arti;
        private LinearLayout box_linear;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nomor = itemView.findViewById(R.id.nomor);
            nama = itemView.findViewById(R.id.nama);
            arti = itemView.findViewById(R.id.arti);
            box_linear = itemView.findViewById(R.id.box_linear);
        }
    }
}

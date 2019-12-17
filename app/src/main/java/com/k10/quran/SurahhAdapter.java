package com.k10.quran;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class SurahhAdapter extends RecyclerView.Adapter<SurahhAdapter.ViewHolder> {

    private Context context;
    private List<Surahh> list;

    public SurahhAdapter(Context context, List<Surahh> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_surah, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Surahh obj = list.get(position);
        holder.nomor.setText(obj.getNomor()+". ");
        holder.nama.setText(obj.getNama());
        holder.arti.setText("Arti: "+obj.getArti());
        holder.asma.setText("Asma: "+obj.getAsma());
        holder.ayat.setText("Ayat: " + obj.getAyat());
        holder.urutan_turun.setText("Turun Ke- "+obj.getUrutan_turun());
        holder.ruku.setText("Jumlah Ruku': " + obj.getRuku());
        holder.nuzul.setText("Tipe Surah: "+obj.getNuzul());
        holder.keterangan.setText(obj.getKeterangan());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView nomor;
        private TextView nama;
        private TextView arti;
        private TextView asma;
        private TextView ayat;
        private TextView urutan_turun;
        private TextView nuzul;
        private TextView ruku;
        private TextView keterangan;
        private LinearLayout box_linear;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nomor = itemView.findViewById(R.id.nomor);
            nama = itemView.findViewById(R.id.nama);
            arti = itemView.findViewById(R.id.arti);
            asma = itemView.findViewById(R.id.asma);
            ayat = itemView.findViewById(R.id.ayat);
            urutan_turun = itemView.findViewById(R.id.urutan_turun);
            nuzul = itemView.findViewById(R.id.nuzul);
            ruku = itemView.findViewById(R.id.ruku);
            keterangan = itemView.findViewById(R.id.keterangan);
            box_linear = itemView.findViewById(R.id.box_linear);
        }
    }
}

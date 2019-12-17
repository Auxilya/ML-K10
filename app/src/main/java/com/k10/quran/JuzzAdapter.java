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

public class JuzzAdapter extends RecyclerView.Adapter<JuzzAdapter.ViewHolder> {

    private Context context;
    private List<Juzz> list;

    public JuzzAdapter(Context context, List<Juzz> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_juz, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Juzz obj = list.get(position);
        holder.ujuz.setText(obj.getUjuz());
        holder.rsurah.setText(obj.getRsurah());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView ujuz;
        private TextView rsurah;
        private LinearLayout box_linear;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ujuz = itemView.findViewById(R.id.ujuz);
            rsurah = itemView.findViewById(R.id.rsurah);
            box_linear = itemView.findViewById(R.id.box_linear);
        }
    }
}

package com.example.tokobuku.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tokobuku.Model.DataModel;
import com.example.tokobuku.R;

import java.util.List;

public class AdapterData extends RecyclerView.Adapter<AdapterData.HolderData>{
    private Context ctx;
    private List<DataModel> listKatalog;

    public AdapterData(Context ctx, List<DataModel> listKatalog) {
        this.ctx = ctx;
        this.listKatalog = listKatalog;
    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        HolderData holder = new HolderData(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull HolderData holder, int position) {
        DataModel dm = listKatalog.get(position);

        holder.tvId.setText(dm.getId());
        holder.tvJudulBuku.setText(dm.getJudul_buku());
        holder.tvPenerbit.setText(dm.getPenerbi());
        holder.tvHrBuku.setText(dm.getHrBuku());
        holder.tvStok.setText(dm.getStok());
    }

    @Override
    public int getItemCount() {
        return listKatalog.size();
    }

    public class HolderData extends RecyclerView.ViewHolder{
        TextView tvId, tvJudulBuku, tvPenerbit, tvHrBuku, tvStok;

        public HolderData(@NonNull View itemView){
            super(itemView);

            tvId        = itemView.findViewById(R.id.tv_id);
            tvJudulBuku = itemView.findViewById(R.id.tv_judulBuku);
            tvPenerbit  = itemView.findViewById(R.id.tv_penerbit);
            tvHrBuku    = itemView.findViewById(R.id.tv_hrBuku);
            tvStok      = itemView.findViewById(R.id.tv_stok);
        }
    }

}

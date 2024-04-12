package com.example.lab2_7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.ViewHolder> {
    private Context mContext;
    private ArrayList<Hero> mHeros;
    // tạo ra các biến cho danh sách các Hero và truyền chúng qua hàm khởi tạo:
    public HeroAdapter(Context mContext, ArrayList<Hero> mHeros) {
        this.mContext = mContext;
        this.mHeros = mHeros;
    }
    // Mọi Adapter sẽ có 3 phương thức quan trọng:
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View heroView = LayoutInflater.from(mContext).inflate(R.layout.item_hero, parent, false);
        ViewHolder viewHolder = new ViewHolder(heroView);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        Hero hero = mHeros.get(position);
//        Glide.with(mContext)
//                .load(hero.getImage())
//                .into(holder.mImageHero);
        holder.mTextName.setText(hero.getName());
        holder.mImageHero.setImageResource(hero.getImage());
    }
    @Override
    public int getItemCount() {
        return mHeros.size();
    }
    // Tạo class viewholder
    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView mImageHero;
        private TextView mTextName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageHero = itemView.findViewById(R.id.image_hero);
            mTextName = itemView.findViewById(R.id.text_name);
        }
    }
}

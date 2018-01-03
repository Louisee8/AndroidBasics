package com.example.android.p8;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ver2point0.android.thegreatestnews.R;

import java.util.List;


public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<com.example.android.p8.News> newsList;
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView news_Title;
        public TextView news_date;
        public TextView news_time;
        public TextView news_type;
        public TextView news_section;
        public MyViewHolder(View view) {
            super(view);
            news_Title = (TextView) view.findViewById(R.id.titleTV);
            news_date = (TextView) view.findViewById(R.id.dataTV);
            news_time = (TextView) view.findViewById(R.id.timeTV);
            news_type = (TextView) view.findViewById(R.id.typeTV);
            news_section = (TextView) view.findViewById(R.id.sectionNameTV);
        }
    }

    public Adapter(List<com.example.android.p8.News> newsList) {
        this.newsList = newsList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final News news = newsList.get(position);
        holder.news_Title.setText(news.getTitle());
        holder.news_date.setText(news.getDate());
        holder.news_time.setText(news.getTime());
        holder.news_type.setText(news.getType());
        holder.news_section.setText(news.getSection());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                final Intent webIntent = new Intent(Intent.ACTION_VIEW);
                context.startActivity(webIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        {
            return newsList.size();
        }
    }
}




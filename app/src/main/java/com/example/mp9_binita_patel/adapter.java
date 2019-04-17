package com.example.mp9_binita_patel;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;


public class adapter extends RecyclerView.Adapter<adapter.ViewHolder>{
    @NonNull
    private List<foundText> mQ;
    public adapter(List<foundText> query) { mQ = query;}
    public adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.foundtext, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull adapter.ViewHolder viewHolder, int i) {
        foundText data = mQ.get(i);
        TextView t1 = viewHolder.mtext;
        t1.setText(data.getText());
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView mtext;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mtext = (TextView)itemView.findViewById(R.id.mtext);
        }

    }
    @Override
    public int getItemCount() {
        return mQ.size();
    }


}

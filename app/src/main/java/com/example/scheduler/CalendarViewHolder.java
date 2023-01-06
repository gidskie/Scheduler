package com.example.scheduler;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class CalendarViewHolder extends RecyclerView.ViewHolder
{

    public CalendarViewHolder(@NonNull View itemView) {
        super(itemView);
        TextView dayOfMonth = itemView.findViewById(R.id.cellDayText);
    }
}
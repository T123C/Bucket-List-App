package com.tc.bucketlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//Custom adapter to show the list items on Places To Go and Things To Do activities
public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemViewHolder> {

    private ListItem[] items;

    public ItemsAdapter(ListItem[] items) {
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.length;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_element, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.bind(items[position]);
    }

    static class ItemViewHolder extends RecyclerView.ViewHolder {

        private ImageView appImage;
        private TextView appTitle;
        private TextView appDescription;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            this.appImage = itemView.findViewById(R.id.image_view_item_image);
            this.appTitle = itemView.findViewById(R.id.text_view_item_title);
            this.appDescription = itemView.findViewById(R.id.text_view_item_description);
        }

        public void bind(ListItem item) {
            appImage.setImageResource(item.image);
            appTitle.setText(item.title);
            appDescription.setText(item.description);
        }
    }
}



package com.nytimes.news.databinding;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;

import com.nytimes.news.data.remote.Resource;
import com.nytimes.news.view.base.BaseAdapter;

import java.util.List;

/**
 * Binding adapters
 */
final class ListBindingAdapter{

    private ListBindingAdapter(){
        // Private Constructor to hide the implicit one
    }

    @SuppressWarnings("unchecked")
    @BindingAdapter(value = "resource")
    public static void setResource(RecyclerView recyclerView, Resource resource){
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if(adapter == null)
            return;

        if(resource == null || resource.data == null)
            return;

        if(adapter instanceof BaseAdapter){
            ((BaseAdapter)adapter).setData((List) resource.data);
        }
    }

}

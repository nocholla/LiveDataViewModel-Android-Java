package com.nocholla.livedata.viewmodel.adapter;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.nocholla.livedata.viewmodel.R;
import com.nocholla.livedata.viewmodel.model.Blog;
import java.util.List;

public class BlogAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    private static final String TAG = "BlogAdapter";

    private List<Blog> blogList;

    public BlogAdapter(List<Blog> blogList) {
        this.blogList = blogList;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.onBind(position);
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.blog_item, parent, false));
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getItemCount() {
        if (blogList != null && blogList.size() > 0) {
            return blogList.size();
        } else {
            return 0;
        }
    }

    public class ViewHolder extends BaseViewHolder {

        ImageView ivThumbnail;
        TextView tvTitle;
        TextView tvDescription;
        TextView tvLink;

        public ViewHolder(View itemView) {
            super(itemView);
            ivThumbnail = itemView.findViewById(R.id.ivThumbnail);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvDescription = itemView.findViewById(R.id.tvDescription);
            tvLink = itemView.findViewById(R.id.tvLink);

        }

        protected void clear() {
            ivThumbnail.setImageDrawable(null);
            tvTitle.setText("");
            tvLink.setText("");
        }

        public void onBind(int position) {
            super.onBind(position);

            final Blog blog = blogList.get(position);

            if (blog.getThumbnail() != null) {
                Glide.with(itemView.getContext())
                        .load(blog.getThumbnail())
                        .into(ivThumbnail);
            }

            if (blog.getTitle() != null) {
                tvTitle.setText(blog.getTitle());
            }

            if (blog.getDescription() != null) {
                tvDescription.setText(blog.getDescription());
            }

            if (blog.getLink() != null) {
                tvLink.setText(blog.getLink());
            }

            tvLink.setOnClickListener(v -> {
                if (blog.getLink() != null) {
                    try {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse(blog.getLink()));
                        itemView.getContext().startActivity(intent);
                    } catch (Exception e) {
                        Log.e(TAG, "onClick: Image url is not correct");
                    }
                }
            });

        }
    }

}

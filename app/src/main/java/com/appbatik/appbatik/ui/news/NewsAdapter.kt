package com.appbatik.appbatik.ui.news

import android.content.Context
import android.content.Intent
import androidx.databinding.ViewDataBinding
import com.appbatik.appbatik.R
import com.appbatik.appbatik.data.model.News
import com.appbatik.appbatik.databinding.ItemNewBinding
import com.appbatik.appbatik.ui.base.BaseAdapter
import com.bumptech.glide.Glide

class NewsAdapter(val context: Context) : BaseAdapter<News>(R.layout.item_new) {
    override fun onBind(binding: ViewDataBinding?, data: News) {
        val mBinding = binding as ItemNewBinding
        Glide.with(context).load(data.poster).into(mBinding.itemPoster)
    }

    override fun onClik(binding: ViewDataBinding?, data: News) {
    val intent = Intent(context, NewsActivity::class.java)
        intent.putExtra(NewsActivity.OPEN_NEWS, data)
        context.startActivity(intent)
    }
}


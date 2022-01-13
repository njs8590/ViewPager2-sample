package com.namdroid.viewpagerexample

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.page_item.view.*

class MyPagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    private var myImageView = itemView.myimageview
    private var myText = itemView.mytext

    fun bindViewModel(myPagerViewModel: MyPagerViewModel){
        this.myText.text = myPagerViewModel.txt
        this.myImageView.setImageResource(myPagerViewModel.imageview!!)
    }

}
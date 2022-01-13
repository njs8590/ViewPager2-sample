package com.namdroid.viewpagerexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyPagerAdapter(var modelList:ArrayList<MyPagerViewModel>):RecyclerView.Adapter<MyPagerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyPagerViewHolder {
        // 연결할 레이아웃설정
        return MyPagerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.page_item, parent, false)) // 루트에 붙일꺼냐? -> false
    }

    override fun getItemCount(): Int {
        return this.modelList.size
    }

    // 뷰홀더에 데이터를 연결해주는 함수
    // -> 뷰는 재활용되지만 데이터는 계속해서 새롭게 연결되어야하기 때문
    override fun onBindViewHolder(holder: MyPagerViewHolder, position: Int) {
        holder.bindViewModel(this.modelList[position])
    }

}
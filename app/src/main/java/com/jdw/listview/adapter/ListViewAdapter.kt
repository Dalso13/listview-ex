package com.jdw.listview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.jdw.listview.R
import com.jdw.listview.viewModel.ListViewModel

class ListViewAdapter(val list : MutableList<ListViewModel>): BaseAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Any? {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup?
    ): View? {
        var converView = convertView

        if (converView == null) {
            // 리스트뷰 아이템 가져오기
            converView = LayoutInflater.from(parent?.context).inflate(R.layout.listview_item, parent, false)
        }

        // 리스트에 내용 텍스트뷰에 적용
        val title = converView!!.findViewById<TextView>(R.id.listviewItem1)
        title.text = list[position].title

        val content = converView.findViewById<TextView>(R.id.listviewItem2)
        content.text = list[position].content



        // 리스트뷰아이템이 담긴 객체 리턴
        return converView
    }
}
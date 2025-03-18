package com.jdw.listview

import android.os.Bundle
import android.os.Handler
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.jdw.listview.adapter.ListViewAdapter
import com.jdw.listview.viewModel.ListViewModel

class MainActivity : AppCompatActivity() {

    private var isDouble = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listItem = mutableListOf<ListViewModel>()

        listItem.add(ListViewModel("a", "b"))
        listItem.add(ListViewModel("c", "d"))
        listItem.add(ListViewModel("e", "f"))

        // 어뎁터 생성 원하는 리스트 넣기
        val adapter = ListViewAdapter(listItem)

        // 리스트뷰 가져오기
        val listview = findViewById<ListView>(R.id.mainListView)

        // 리스트뷰 어뎁터 적용
        listview.adapter = adapter


    }

    override fun onBackPressed() {

        if (isDouble) super.onBackPressed()

        isDouble = true
        Toast.makeText(this, "종료하시려면 더블클릭", Toast.LENGTH_LONG).show()

        Handler().postDelayed(Runnable {
            isDouble = false
        }, 2000)

    }
}
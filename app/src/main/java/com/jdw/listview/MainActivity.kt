package com.jdw.listview

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.jdw.listview.adapter.ListViewAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listItem = mutableListOf<String>(
            "A",
            "B",
            "C"
        )

        // 어뎁터 생성 원하는 리스트 넣기
        val adapter = ListViewAdapter(listItem)

        // 리스트뷰 가져오기
        val listview = findViewById<ListView>(R.id.mainListView)

        // 리스트뷰 어뎁터 적용
        listview.adapter = adapter


    }
}
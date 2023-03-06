package com.example.notestask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.notestask.databinding.ActivityMainBinding
import com.example.notestask.domain.adapter.NoteAdapter
import com.example.notestask.screens.MainFragment

class MainActivity : AppCompatActivity() {


    private lateinit var main: ActivityMainBinding
    lateinit var adapter: NoteAdapter
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(main.root)
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragmentholder, MainFragment())
            .commit()



    }

    private fun initial() {

    }
}
package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frame_layout_fragment, firstFragment)
            commit()
        }

        btn_fragment1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frame_layout_fragment, firstFragment)
                addToBackStack(null)
                commit()
            }
        }

        btn_fragment2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frame_layout_fragment, secondFragment)
                addToBackStack(null)
                commit()
            }
        }
    }
}
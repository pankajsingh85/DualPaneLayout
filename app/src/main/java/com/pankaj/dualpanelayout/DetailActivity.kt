package com.pankaj.dualpanelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val description = intent.getStringExtra("description")
        val title = intent.getStringExtra("title")

        val fragmentB = supportFragmentManager.findFragmentById(R.id.fragmentB) as FragmentB?
        if (title != null) {
            if (description != null) {
                fragmentB?.displayDetails(title, description)
            }
        }
    }
}
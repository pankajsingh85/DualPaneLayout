package com.pankaj.dualpanelayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_a.view.*


class FragmentA: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_a, container, false)
        setupRecyclerView(rootView)
        return rootView
    }

    private fun setupRecyclerView(rootView: View) {
        val recyclerView = rootView.recycler_view as RecyclerView
        val adapter = RecyclerAdapter(context, DataProvider.data)
        recyclerView.adapter = adapter
        val manager = LinearLayoutManager(activity)
        manager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = manager
    }
}
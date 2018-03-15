package com.manikandan.samplekotlinproject

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
/**
 * Created by manikandan on 15/03/18.
 */


class PageFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_page, container, false)
        val page = getArguments().getInt(PAGE_NUM)

        val tvHello: TextView = view.findViewById(R.id.tv_hello)
        tvHello.text = "Fragment $page"
        return view
    }
    companion object {
        val PAGE_NUM = "PAGE_NUM"
        fun newInstance(page: Int): PageFragment {
            val fragment = PageFragment()
            val args = Bundle()
            args.putInt(PAGE_NUM, page)
            fragment.setArguments(args)
            return fragment
        }
    }
}
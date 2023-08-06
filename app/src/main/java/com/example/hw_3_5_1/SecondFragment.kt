package com.example.hw_3_5_1

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class SecondFragment : Fragment() {
    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val secondTextView = view.findViewById<TextView>(R.id.secondTextView)
        val count = arguments?.getInt("COUNT", 0)
        secondTextView.text = "Value from First Fragment: $count"
        return view
    }
}

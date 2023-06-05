package com.example.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home,container,false)
        val edtTxt = view.findViewById<TextView>(R.id.edtName)
        val btnDisplay = view.findViewById<Button>(R.id.btnDisplay)

        btnDisplay.setOnClickListener {
            Toast.makeText(context, "Hello, ${edtTxt.text.toString()}", Toast.LENGTH_SHORT).show()
        }
        return view
    }
}
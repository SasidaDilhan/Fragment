package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val imgHome:ImageView = findViewById(R.id.imageView)
    val imgUser:ImageView = findViewById(R.id.imageView2)
    val fragmentHome = HomeFragment()
    val fragmentUser = UserFragment()


    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        imgUser.setOnClickListener {
            imgHome.setImageResource(R.drawable.unselected_home)
            imgUser.setImageResource(R.drawable.selected_person)

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView,fragmentUser)
                commit()
            }
        }

        imgHome.setOnClickListener {
            imgHome.setImageResource(R.drawable.selected_home)
            imgUser.setImageResource(R.drawable.unselected_person)

            supportFragmentManager.beginTransaction().apply{
                replace(R.id.fragmentContainerView,fragmentHome)
                commit()
            }
        }
    }

//    private fun replacefragment(fragment:Fragment){
//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
//
//        fragmentTransaction.replace(R.id.)
//    }


}
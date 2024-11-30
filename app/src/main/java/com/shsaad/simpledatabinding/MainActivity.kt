package com.shsaad.simpledatabinding

import android.app.Application.ActivityLifecycleCallbacks
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.viewbinding.ViewBinding
import com.shsaad.simpledatabinding.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {



    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)


        val mUser= User("Saad","saad@gamil.com")
        val mPost= Post("this is a title","this is a description")




        binding.apply {
            user=mUser
            post=mPost
        }

    }
}

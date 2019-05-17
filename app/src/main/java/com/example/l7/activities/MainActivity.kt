package com.example.l7.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.AndroidViewModel
import com.example.l7.R
import com.example.l7.viewmodels.GithubRepoViewModel

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: GithubRepoViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun bind(){
        viewModel
    }
}

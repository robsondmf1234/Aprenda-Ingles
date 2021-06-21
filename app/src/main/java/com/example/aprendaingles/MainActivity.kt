package com.example.aprendaingles

import Fragments.BichosFragment
import Fragments.NumerosFragment
import Fragments.VogaisFragment
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.ogaclejapan.smarttablayout.SmartTabLayout
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems

class MainActivity : AppCompatActivity() {

    lateinit var smartTabLayout: SmartTabLayout
    lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        smartTabLayout = findViewById<SmartTabLayout>(R.id.viewPagerTabLayout)
        viewPager = findViewById(R.id.viewpager)

        //Recuperando a instancia do ActionBar e setando um elevation
        supportActionBar?.elevation = 0.0F

        //Configurando o adapter
        val adapter = FragmentPagerItemAdapter(
            supportFragmentManager,
            FragmentPagerItems.with(this)
                .add("Bichos", BichosFragment::class.java)
                .add("Numeros", NumerosFragment::class.java)
                .add("Vogais", VogaisFragment::class.java)
                .create()
        )

        //Setando o adapter
        viewPager.adapter = adapter

        //Setando o viewPager para as abas
        smartTabLayout.setViewPager(viewPager)
    }
}
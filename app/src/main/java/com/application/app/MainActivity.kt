package com.application.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.FrameLayout
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    lateinit var drawerLayout: DrawerLayout
    lateinit var coordinatorLayout: CoordinatorLayout
    lateinit var toolbar: Toolbar
    lateinit var frameLayout: FrameLayout
    lateinit var navigationView: NavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawerLayout= findViewById(R.id.drawer)
        coordinatorLayout=findViewById(R.id.coordinator)
        toolbar=findViewById(R.id.toolbar)
        frameLayout=findViewById(R.id.frame)
        navigationView=findViewById(R.id.navigation)
        setUpToolbar()
        var actionBarDrawerToggle = ActionBarDrawerToggle(this@MainActivity,drawerLayout,R.string.open_drawer,R.string.close_drawer)
        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()

        navigationView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.jobsportal ->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame,Jobs())
                        
                    drawerLayout.closeDrawers()
                }
                R.id.examportal ->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame,Exams())

                    drawerLayout.closeDrawers()
                }
                R.id.docupload ->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame,DocumentsUpload())

                    drawerLayout.closeDrawers()
                }
                R.id.exammaterials ->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame,Exammat1())

                    drawerLayout.closeDrawers()
                }
                R.id.profile ->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame,profile())

                    drawerLayout.closeDrawers()
                }
                
            }

            return@setNavigationItemSelectedListener true

        }
    }
    fun setUpToolbar(){
        setSupportActionBar(toolbar)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun setSupportActionBar(toolbar: Toolbar) {

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
        val id = item.itemId
        if (id == android.R.id.home){
            drawerLayout.openDrawer(GravityCompat.START)
        }
    }

}

private fun FragmentTransaction.replace(frame: Int, profile: profile) {

}

private fun FragmentTransaction.replace(frame: Int, exammat1: Exammat1) {

}

private fun FragmentTransaction.replace(frame: Int, documentsUpload: DocumentsUpload) {

}

private fun FragmentTransaction.replace(frame: Int, exams: Exams) {

}

private fun FragmentTransaction.replace(frame: Int, jobs: Jobs) {

}

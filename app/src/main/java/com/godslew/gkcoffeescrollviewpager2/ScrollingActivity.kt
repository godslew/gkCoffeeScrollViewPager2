package com.godslew.gkcoffeescrollviewpager2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.godslew.gkcoffeescrollviewpager2.databinding.ActivityScrollingBinding
import timber.log.Timber

class ScrollingActivity : AppCompatActivity(),
    FragmentAdapter.OnChangeTitleListener {

    private val binding by lazy { ActivityScrollingBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        supportActionBar?.title = null
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setupViewpager2()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_scrolling, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun setupViewpager2() {
        binding.apply {
            viewpager2.adapter = FragmentAdapter(this@ScrollingActivity, PageType.getPages())
        }
    }

    override fun onChangeTitle(title: String) {
        Timber.d("snake00 $title")
        binding.toolbarLayout.title = title
    }
}

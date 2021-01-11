package com.senix22.progressbarapplication

import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.TimeUnit


class MainActivity : AppCompatActivity() {
    private var n: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener {
            hideProgress()
            tvText.text = "n = $n"
            TimeUnit.SECONDS
            Handler().postDelayed(Runnable {
                showProgress()

            }, ((n + 1) / 10) * 1000.toLong())
        }
    }

    private fun hideProgress() {
        n++
        tvText.visibility = View.GONE
        progress_bar.visibility = View.VISIBLE
        btn.visibility = View.GONE
    }

    private fun showProgress() {
        tvText.visibility = View.VISIBLE
        progress_bar.visibility = View.GONE
        btn.visibility = View.VISIBLE
    }
}
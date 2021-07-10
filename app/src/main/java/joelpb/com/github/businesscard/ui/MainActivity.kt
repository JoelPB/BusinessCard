package joelpb.com.github.businesscard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import joelpb.com.github.businesscard.R
import joelpb.com.github.businesscard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}
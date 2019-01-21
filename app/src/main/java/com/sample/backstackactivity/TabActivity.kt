package com.sample.backstackactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView

class TabActivity : AppCompatActivity() {

    private var textValue : String = "Constructed Tab Text"

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        persistentState?.let {
            textValue = it.getString( TEXT_KEY )
        }
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab)

        savedInstanceState?.let {
            textValue = it.getString( TEXT_KEY )
        }

        findViewById<TextView>(R.id.text).apply {
            text = textValue
        }
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        outPersistentState.putString( TEXT_KEY, "Restored Tab Text" )
        super.onSaveInstanceState(outState, outPersistentState)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString( TEXT_KEY, textValue )
        super.onSaveInstanceState(outState)
    }

    companion object {
        private const val TEXT_KEY = "TEXT"
    }
}

package ro.pub.cs.systems.eim.colocviu1_2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_practical_test01_2_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val nextTerm = findViewById<EditTextNumber>(R.id.NextTerm)
        val allTerms = findViewById<TextView>(R.id.AllTerms)
        val add = findViewById<Button>(R.id.add)
        val compute = findViewById<Button>(R.id.compute)





        add.setOnClickListener {
            val value = NextTerm.text.toString()
            var text = AllTerms.text.toString()
            if(text.lenth() == 0)
                text = text.plus(value)
            else
                text = text.plus("+").plus(value)

            allTerms.setText(text)
        }



    }



}


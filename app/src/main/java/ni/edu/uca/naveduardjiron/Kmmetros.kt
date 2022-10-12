package ni.edu.uca.naveduardjiron

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class Kmmetros : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kmmetros)


   var txtkm:EditText=findViewById(R.id.txtkm)
        var txtresp:TextView=findViewById(R.id.txtresp)

        var metros:Double=txtkm.text.toString().toDouble()*1000
        txtresp.text=metros.toString()




    }
}
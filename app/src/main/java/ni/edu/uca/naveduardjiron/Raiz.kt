package ni.edu.uca.naveduardjiron

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Raiz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_raiz)


        var txtraiz:EditText=findViewById(R.id.txtPoten)
        var btnraiz:Button=findViewById(R.id.btnraiz)
        var txtRespRaiz:TextView=findViewById(R.id.txtresp)

        btnraiz.setOnClickListener(){

            var raiz:Double=txtraiz.text.toString().toDouble()
            var raiz2:Double=Math.sqrt(raiz)
            txtRespRaiz.text=raiz2.toString()

        }





    }
}
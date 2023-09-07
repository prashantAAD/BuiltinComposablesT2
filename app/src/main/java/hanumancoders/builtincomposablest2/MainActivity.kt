package hanumancoders.builtincomposablest2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.res.painterResource

import androidx.compose.ui.tooling.preview.Preview



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text(text = "prashant chauhan")
        }
    }
}


@Preview(showBackground = true, widthDp = 200, heightDp = 50)
@Composable
private fun PreviewFunction3(){
 Button(
     onClick = { }, colors = ButtonDefaults.buttonColors(
         contentColor = Color.White,

     ),
     enabled = true
     ) {
     Text(text = "hello hanuman")
     Image(painter = painterResource(id =R.drawable.abs  ), contentDescription ="dummy image")
 }
}



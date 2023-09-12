package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
//    private static final String TAGs = "MyActivity";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }


    }

    override fun onStart(

    ){
        super.onStart()
        var message1: String
        var tag: String = "tag"
        message1 ="onStart"
        Log.v(tag,message1)
        Log.d(tag,message1)
        Log.i(tag,message1)
        Log.w(tag,message1)
        Log.e(tag,message1)
    }

    override fun onRestart(){
        super.onRestart()
        var tag: String
        var message1: String
        tag = "tag"
        message1 ="onRestart"
        Log.v(tag,message1)
        Log.d(tag,message1)
        Log.i(tag,message1)
        Log.w(tag,message1)
        Log.e(tag,message1)
    }

    override fun onResume(){
        super.onResume()
        var tag: String
        var message1: String
        tag = "tag"
        message1 ="onResume"
        Log.v(tag,message1)
        Log.d(tag,message1)
        Log.i(tag,message1)
        Log.w(tag,message1)
        Log.e(tag,message1)
    }

    override fun onPause(){
        super.onPause()
        var tag: String
        var message1: String
        tag = "tag"
        message1 ="onPause"
        Log.v(tag,message1)
        Log.d(tag,message1)
        Log.i(tag,message1)
        Log.w(tag,message1)
        Log.e(tag,message1)
    }

    override fun onStop(){
        super.onStop()
        var tag: String
        var message1: String
        tag = "tag"
        message1 ="onStop"
        Log.v(tag,message1)
        Log.d(tag,message1)
        Log.i(tag,message1)
        Log.w(tag,message1)
        Log.e(tag,message1)
    }

    override fun onDestroy(){
        super.onDestroy()
        var tag: String
        var message1: String
        tag = "tag"
        message1 ="onDestroy"
        Log.v(tag,message1)
        Log.d(tag,message1)
        Log.i(tag,message1)
        Log.w(tag,message1)
        Log.e(tag,message1)
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}
package com.example.jeneral_kotlin

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jeneral_kotlin.ui.theme.Jeneral_kotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Jeneral_kotlinTheme {

            }
        }
        sayMyName("fatemeh",22)
        //named function
        sayMyName(age = 67, name = "zahra")

        val name=MyClass()
        val str=name getMyFullName "sadeghi"
    }

    fun sayMyName(name:String,age:Int):String{
        Log.e("3636",name)
        return name;
    }

    fun sayMyName2(name:String)=name

    fun sayMyNameDefaultArgs(name:String,age:Int=65):String{
        Log.e("3636",name)
        return name;
    }

    fun testFun():Unit{

    }

    infix fun MyClass.getMyFullName(family:String):String{
        return "${this.name} $family"
    }


}


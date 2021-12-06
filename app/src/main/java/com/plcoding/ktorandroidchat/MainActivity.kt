package com.plcoding.ktorandroidchat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

          Surface {

              ElementView()



            }
            
        }
    }


    @Preview
    @Composable
    fun ElementView(){

        Box(modifier = Modifier.fillMaxWidth(),

            ){
            Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment =Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center

                ) {

                Text("Hello",
                    color = MaterialTheme.colors.primary,
                    fontSize = 24.sp,
                    textAlign = TextAlign.Center

                )

            }
        }

    }
}
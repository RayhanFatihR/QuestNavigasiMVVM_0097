package com.example.pertemuan6.view

import android.R
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource

@Composable
fun FormIsian(
    jenisK:List<String> = listOf("Laki-laki", "Perempuan"),
    OnSubmitBtnClick : () -> Unit
){
    Scaffold(modifier = Modifier ,
        topBar = {
            TopAppBar(
                title = {Text(stringResource("Form Isian"), color = Color.White )},
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    colorResource(R.color.teal_700))
            ) }
}   ) {

    }
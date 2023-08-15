package com.example.warmuptask

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.warmuptask.ui.theme.WhiteCustom

@Composable
fun TextLink(text: String, navController: NavHostController, appType: String, packageName: String) {
    Text(
        text = text,
        color = WhiteCustom,
        textDecoration = TextDecoration.Underline,
        fontSize = 24.sp,
        modifier = Modifier
            .padding(8.dp)
            .clickable {
                navController.navigate(Screen.Download.withArgs(appType, packageName))
            }
    )
}
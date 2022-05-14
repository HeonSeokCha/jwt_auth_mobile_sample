package com.chs.jwt_auth_mobile_sample.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import com.chs.jwt_auth_mobile_sample.ui.theme.Jwt_auth_mobile_sampleTheme
import com.ramcosta.composedestinations.DestinationsNavHost
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jwt_auth_mobile_sampleTheme {
                DestinationsNavHost(navGraph = NavGraphs.root)
            }
        }
    }
}
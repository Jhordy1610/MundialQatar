package pe.edu.ulima.pm.mundialqatar

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pe.edu.ulima.pm.mundialqatar.presentation.screens.login.LoginScreen
import pe.edu.ulima.pm.mundialqatar.ui.theme.MundialQatarTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            LoginScreen(
                cambiarAMain = {
                    val intent = Intent(this, MainActivity::class.java)
                    intent.putExtra("NOMBRE", it)
                    startActivity(intent)
                    finish()
                }
            )

        }
    }
}


package br.senai.sp.jandira.login.logincomponent.components

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.login.components.CaixaDeTexto
import java.text.Normalizer.Form

@Composable
fun Form(){
    //variaveis de estados
    var emailState by remember {
        mutableStateOf("")
    }

    var senhaState by remember {
        mutableStateOf("")
    }

    Card {
        Column  (modifier = Modifier.padding(8.dp)){
            CaixaDeTexto(
                label = "Seu e-mail",
                valor = emailState,
                aoMudar = {
                emailState = it
                }
            )

            CaixaDeTexto(
                label = "Sua Senha",
                valor = senhaState,
                aoMudar = {
                senhaState = it
                }
            )

        }
    }
}

@Preview (showBackground = true)
@Composable()
fun FormPreview () {
    Form()
}

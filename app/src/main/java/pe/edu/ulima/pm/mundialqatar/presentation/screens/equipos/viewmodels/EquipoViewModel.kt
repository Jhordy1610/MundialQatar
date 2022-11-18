package pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos.viewmodels

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import pe.edu.ulima.pm.mundialqatar.model.entity.Worldcup
import pe.edu.ulima.pm.mundialqatar.model.remote.HTTPManager

class EquipoViewModel : ViewModel() {

    val listaWorldcup = mutableStateListOf<Worldcup>()

    fun getWorldCup() {

        viewModelScope.launch {
            val worldcup = withContext(Dispatchers.IO) {
                HTTPManager.instance.getWorldCup()
            }

            if (worldcup != null) {
                listaWorldcup.add(worldcup)
            } else {
                Log.e("EquiposScreen", "Error de comunicación con el servicio")
            }
        }

    }

}
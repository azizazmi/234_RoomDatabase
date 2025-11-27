package com.example.prak7_roomdatabase.viewmodel

import androidx.lifecycle.ViewModel
import com.example.prak7_roomdatabase.repository.RepositoriSiswa

class HomeViewModel (private val repositoriSiswa: RepositoriSiswa): ViewModel() {
    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }
}
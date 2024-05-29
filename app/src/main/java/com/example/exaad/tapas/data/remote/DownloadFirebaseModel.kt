package com.example.exaad.tapas.data.remote

data class DownloadFirebaseModel(
    @get:ParameterName("description") @set:ParameterName("description") var description: String? = null
)
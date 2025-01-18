package com.tushant.gamehok.model

data class Tournament(
    val imageRes: Int,
    val title: String,
    val organizer: String,
    val tags: List<String>,
    val time: String,
    val prizePool: String,
    val progress: String,
    val status: String
)

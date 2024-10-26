package com.plcoding.cryptotracker.crypto.domain

data class Coin(
    val id: String,
    val rank: Int,
    val name: String,
    val symbol: String,
    val marketCap: USD,
    val price: USD,
    val changePercent24Hr: Double,
)

typealias USD = Double
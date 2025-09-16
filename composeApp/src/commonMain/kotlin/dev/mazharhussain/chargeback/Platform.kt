package dev.mazharhussain.chargeback

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
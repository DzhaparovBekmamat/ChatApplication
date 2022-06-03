package me.inassar.demos.socialapp.di

import me.inassar.demos.socialapp.common.ktorHttpClient
import org.koin.dsl.module

/**
 * App module
 * This DI module will be responsible of providing dependencies
 * that will be live till the app is living instead of hardcoding
 * them into classes constructors
 * @constructor Create empty App module
 */
val appModule = module {
    single { ktorHttpClient }
}
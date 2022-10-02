package com.picpay.desafio.android.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides


@Module
class SharedPreferenceModule {

    @Provides
    fun provideSharedPreferences(application: Application): SharedPreferences? {
        return application.getSharedPreferences("", Context.MODE_PRIVATE)
    }
}
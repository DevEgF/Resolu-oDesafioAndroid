package com.picpay.desafio.android.di

import com.picpay.desafio.android.data.repository.PicPayRepository
import com.picpay.desafio.android.data.repository.PicPayRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindPicPayRepository(
        picPayRepositoryImpl: PicPayRepositoryImpl
    ): PicPayRepository
}
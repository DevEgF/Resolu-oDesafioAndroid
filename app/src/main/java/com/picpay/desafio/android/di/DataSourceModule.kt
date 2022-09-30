package com.picpay.desafio.android.di

import com.picpay.desafio.android.data.datasource.PicPayDataSource
import com.picpay.desafio.android.data.datasource.PicPayDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {

    @Binds
    abstract fun bindPicPayDatasource(
        picPayDatasourceImpl: PicPayDataSourceImpl
    ): PicPayDataSource
}
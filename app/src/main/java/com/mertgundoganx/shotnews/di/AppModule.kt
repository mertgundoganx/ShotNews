package com.mertgundoganx.shotnews.di

import com.mertgundoganx.shotnews.data.api.BaseNewsService
import com.mertgundoganx.shotnews.data.repository.BaseNewsResponseRepository
import com.mertgundoganx.shotnews.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constants.baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideBaseNewsResponseService(retrofit: Retrofit): BaseNewsService {
        return retrofit.create(BaseNewsService::class.java)
    }


    @Singleton
    @Provides
    fun provideBaseNewsResponseRepository(baseNewsResponseService: BaseNewsService): BaseNewsResponseRepository {
        return BaseNewsResponseRepository(baseNewsResponseService)
    }

}
package uk.endclothing.task.core.di.modules

import uk.endclothing.task.core.di.scopes.AppScope
import uk.endclothing.task.core.remote.parser.DateAndTime


import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import uk.endclothing.task.core.BuildConfig
import uk.endclothing.task.core.remote.datasource.CatalogDataSource
import uk.endclothing.task.core.remote.parser.DateAndTimeJasonAdapter
import uk.endclothing.task.core.remote.parser.DateJasonAdapter
import uk.endclothing.task.core.remote.services.CatalogService
import java.util.Date
import java.util.concurrent.TimeUnit

@Module
class NetworkModule {


    @AppScope
    @Provides
    fun provideHttpLoggingInterceptor() =
        HttpLoggingInterceptor().also {
            it.level = HttpLoggingInterceptor.Level.BODY
        }

    @AppScope
    @Provides
    fun provideOKHttpClient(
        loggingInterceptor: HttpLoggingInterceptor
    ): OkHttpClient {
        val httpClientBuilder = OkHttpClient.Builder().also {
            // don't remove this ..keep it as they want
            it.writeTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .callTimeout(60, TimeUnit.SECONDS)
                .connectTimeout(60, TimeUnit.SECONDS)
            if (BuildConfig.DEBUG) {
                it.addInterceptor(loggingInterceptor)
            }
        }
        return httpClientBuilder.build()
    }

    @AppScope
    @Provides
    fun provideMoshi(): Moshi = Moshi.Builder()
        .add(Date::class.java, DateJasonAdapter().nullSafe())
        .add(DateAndTime::class.java, DateAndTimeJasonAdapter().nullSafe())
        .build()

    @AppScope
    @Provides
    fun provideMoshiConverterFactory(moshi: Moshi): Converter.Factory =
        MoshiConverterFactory.create(moshi)

    @AppScope
    @Provides
    fun provideRetrofit(
        client: OkHttpClient,
        factory: Converter.Factory
    ): Retrofit =
        Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .addConverterFactory(factory)
            .client(client)
            .build()

    //=========================== SERVICES =================================
    @AppScope
    @Provides
    fun provideCatalogService(retrofit: Retrofit): CatalogService =
        retrofit.create(CatalogService::class.java)

    //=========================== DATA_SOURCES =================================

    @AppScope
    @Provides
    fun provideCatalogDatasource(
        service: CatalogService,
        moshi: Moshi
    ) = CatalogDataSource(service, moshi)

}


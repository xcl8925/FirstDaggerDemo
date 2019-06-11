package com.demo.xiechunlei.dagger.injector.module

import com.demo.xiechunlei.dagger.model.Engine
import com.demo.xiechunlei.dagger.model.Seat
import dagger.Module
import dagger.Provides

@Module
class CarModule {
    @Provides
    fun provideEngine(): Engine {
        return Engine()
    }

    @Provides
    fun provideSeat(): Seat {
        return Seat()
    }
}
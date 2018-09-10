package cn.civaonline.ss.githubdemo

import android.app.Application
import android.content.ContextWrapper

/**
 * @author shaoshuai
 * @Date 2018 09 10 下午 16:02
 * @Infomation
 */

private lateinit var INSTANCE:Application

class App:Application() {
    override fun onCreate() {
        super.onCreate()
        INSTANCE =this
    }
}

object AppContext:ContextWrapper(INSTANCE)
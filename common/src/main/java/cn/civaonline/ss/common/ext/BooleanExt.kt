package cn.civaonline.ss.common.ext

/**
 * @author shaoshuai
 * @Date 2018 09 10 下午 14:45
 * @Infomation
 */
sealed class BooleanExt<out T>

object Otherwise : BooleanExt<Nothing>()

class WithData<T>(val data: T) :BooleanExt<T>()

inline fun<T> Boolean.yes(block: () -> T)=
        when {
            this -> {
                WithData(block())
            }

            else ->{
                Otherwise
            }
        }

inline fun<T> Boolean.no(block: () -> T)=
        when {
            this -> {
                Otherwise
            }

            else ->{
                WithData(block())
            }
        }

inline fun<T> BooleanExt<T>.otherwise(block: () -> T):T=
   when(this){
        is Otherwise ->block()
        is WithData -> this.data
   }


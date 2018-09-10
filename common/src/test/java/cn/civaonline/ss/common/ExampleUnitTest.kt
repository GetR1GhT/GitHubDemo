package cn.civaonline.ss.common

import cn.civaonline.ss.common.ext.Otherwise
import cn.civaonline.ss.common.ext.WithData
import cn.civaonline.ss.common.ext.otherwise
import cn.civaonline.ss.common.ext.yes
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ExampleUnitTest {
    @Test
    fun testBoolean(){
        getABoolean().yes {
            println("OK")
        }.otherwise {
            print("otherWise")
        }
    }

    private fun getABoolean() = false
}

fun main(args: Array<String>) {
    val result = true.yes {
        1
    }.otherwise {
        2
    }
}
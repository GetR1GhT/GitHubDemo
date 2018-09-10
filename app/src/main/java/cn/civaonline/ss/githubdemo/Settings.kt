package cn.civaonline.ss.githubdemo

import cn.civaonline.ss.common.ext.Preference

/**
 * @author shaoshuai
 * @Date 2018 09 10 下午 16:01
 * @Infomation
 */
object Settings {
    var email:String by Preference(AppContext,"email","")
    var password:String by Preference(AppContext,"password","")
}
package com.coderpig.wechathelper

import com.google.gson.annotations.SerializedName

import java.io.Serializable
import java.util.ArrayList

/**
 * 描述：
 *
 * @author jay on 2018/11/1 15:43
 */
class Member : Serializable {
    @SerializedName("Python")
    var python_1 = ArrayList<String>()

    @SerializedName("Android")
    var android = ArrayList<String>()

    @SerializedName("Python2")
    var python_2 = ArrayList<String>()

    @SerializedName("Guy")
    var guy = ArrayList<String>()
}

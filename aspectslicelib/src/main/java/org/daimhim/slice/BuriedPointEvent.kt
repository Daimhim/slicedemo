package org.daimhim.slice

import android.annotation.TargetApi

@Target(AnnotationTarget.FUNCTION,AnnotationTarget.CLASS)
@Retention(AnnotationRetention.BINARY)
annotation class BuriedPointEvent(val key:String,val value:String) {
}
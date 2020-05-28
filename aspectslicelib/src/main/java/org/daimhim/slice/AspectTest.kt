package org.daimhim.slice

import android.util.Log
import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.After
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.annotation.Pointcut

@Aspect
class AspectTest {
    /**
     * 接受事件，在注解方法调用之后
     */
    @Pointcut("call(@org.daimhim.slice.BuriedPointEvent(..)")
    fun acceptEvent(){

    }
    @Before("execution(com.arno.testaspectj.MainActivity.onCreate(..))")
    fun event(joinPoint: JoinPoint){
        Log.e("AspectTest", joinPoint.toShortString());
    }
}
package twoguards.annotation


@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
annotation class BuriedPointEvent(val key:String,val value:String) {
}
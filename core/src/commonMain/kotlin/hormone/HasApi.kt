package hormone

interface HasApi<out A> {
    val api: A
}
package hormone

interface HasApi<out A> {
    val api: A

    fun <R> map(transformer: (A) -> R): HasApi<R>
}
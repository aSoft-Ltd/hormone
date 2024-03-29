@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package hormone

import kotlinx.JsExport
import kotlin.js.JsName
import kollections.List

interface Crud<out T> {
    val asCreate get() = this as? Create
    val asUpdate get() = this as? Update
    val asDelete get() = this as? Delete
    val asRead get() = this as? Read
}

data object Create : Crud<Nothing>

data class Update<out T>(val data: T) : Crud<T>

sealed interface Delete<out T> : Crud<T> {
    val asSingle get() = this as? Single
    val asMany get() = this as? Many
}

@JsName("deleteSingle")
fun <T> Delete(data: T) = Single(data)

@JsName("deleteMany")
fun <T> Delete(data: List<T>) = Many(data)

data class Single<out T>(val data: T) : Delete<T>

data class Many<out T>(val data: List<T>) : Delete<T>

data class Read<out T>(val data: T) : Crud<T>
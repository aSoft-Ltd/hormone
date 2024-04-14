@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package hormone

import kollections.List
import koncurrent.Later
import kotlinx.JsExport
import kronecker.LoadOptions
import kotlin.js.JsName

interface Loader<out R> {
    fun load(options: LoadOptions = LoadOptions()): Later<List<R>>

    @JsName("loadById")
    fun load(uid: String): Later<R>
}
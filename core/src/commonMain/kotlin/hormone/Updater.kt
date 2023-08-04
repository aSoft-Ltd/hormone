@file:Suppress("NON_EXPORTABLE_TYPE")

package hormone

import koncurrent.Later
import kotlin.js.JsExport

@JsExport
interface Updater<in P, out R> {
    fun update(params: P): Later<R>
}
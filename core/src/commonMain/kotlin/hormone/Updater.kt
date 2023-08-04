@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package hormone

import koncurrent.Later
import kotlin.js.JsExport

interface Updater<in P, out R> {
    fun update(params: Identified<String,P>): Later<R>
}
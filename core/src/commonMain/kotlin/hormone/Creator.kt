@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package hormone

import koncurrent.Later
import kotlinx.JsExport

interface Creator<in P, out R> {
    fun create(params: P): Later<R>
}
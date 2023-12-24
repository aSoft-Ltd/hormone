@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package hormone

import koncurrent.Later
import koncurrent.later.then
import koncurrent.later.andThen
import koncurrent.later.andZip
import koncurrent.later.zip
import koncurrent.later.catch
import kotlinx.JsExport

interface Creator<in P, out R> {
    fun create(params: P): Later<R>
}
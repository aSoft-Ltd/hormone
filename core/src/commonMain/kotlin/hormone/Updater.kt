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

interface Updater<in P, out R> {
    fun update(params: Identified<String,P>): Later<R>
}
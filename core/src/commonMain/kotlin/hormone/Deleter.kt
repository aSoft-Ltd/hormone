@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package hormone

import kollections.List
import koncurrent.Later
import kotlinx.JsExport

interface Deleter<out R : Any> {
    fun delete(uid: String): Later<R?>
    fun deleteBulk(ids: List<String>): Later<List<R?>>
}
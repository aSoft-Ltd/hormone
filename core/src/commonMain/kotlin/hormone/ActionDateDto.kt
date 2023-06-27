@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package hormone

import kotlin.js.JsExport
import kotlinx.serialization.Serializable
import krono.Instant

@Serializable
data class ActionDateDto (
    val created: Instant,
    val updated: Instant
)
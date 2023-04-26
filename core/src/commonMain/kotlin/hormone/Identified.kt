package hormone

import kotlinx.serialization.Serializable

@Serializable
data class Identified<out I, out P>(val uid: I, val body: P)
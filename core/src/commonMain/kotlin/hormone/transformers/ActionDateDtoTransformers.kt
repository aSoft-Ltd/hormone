package hormone.transformers

import hormone.ActionDateDto
import hormone.ActionDatePresenter
import krono.PureDateTimeFormatter
import krono.TimeZone
import krono.toDateTimePresenter

fun ActionDateDto.toPresenter(tz: TimeZone, formatter: PureDateTimeFormatter) = ActionDatePresenter(
    created = created.toDateTimePresenter(tz, formatter),
    updated = updated.toDateTimePresenter(tz, formatter)
)
package hormone.transformers

import hormone.ActionDateDto
import hormone.ActionDatePresenter
import krono.PresenterPattern
import krono.PureDateTimeFormatter
import krono.TimeZone
import krono.toDateTimePresenter

fun ActionDateDto.toPresenter(tz: TimeZone, pattern: PresenterPattern) = ActionDatePresenter(
    created = created.toDateTimePresenter(tz, pattern),
    updated = updated.toDateTimePresenter(tz, pattern)
)
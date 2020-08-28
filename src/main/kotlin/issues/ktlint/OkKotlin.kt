package issues.ktlint

import issues.ktlint.kotlin.Mutation
import issues.ktlint.kotlin.Row
import issues.ktlint.kotlin.RowMutation.Companion.create

fun main() {
    val row = Row()
    val mutation: Mutation = create()
}

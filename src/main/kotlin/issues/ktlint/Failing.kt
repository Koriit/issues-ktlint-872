package issues.ktlint

import com.google.cloud.bigtable.data.v2.BigtableDataClient
import com.google.cloud.bigtable.data.v2.models.Mutation
import com.google.cloud.bigtable.data.v2.models.Row
// import com.google.cloud.bigtable.data.v2.models.RowMutation
import com.google.cloud.bigtable.data.v2.models.RowMutation.create // problematic import
import io.mockk.mockk

fun main() {
    val btClient: BigtableDataClient = mockk(relaxed = true)
    val row: Row = mockk()

    btClient.mutateRow(create("string", "string", Mutation.create()))
}

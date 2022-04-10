import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable

fun main() {
    var count: Int by mutableStateOf(0)

    renderComposable(rootElementId = "root") {
        Div({ style { padding(25.px) } }) {
            Button(attrs = {
                onClick { count -= 1 }
            }) {
                Text("-Why didn't taht work")
            }

            Span({ style { padding(15.px) } }) {
                Text("$count (Hello World)")
            }

            Button(attrs = {
                onClick { count += 1 }
            }) {
                Text("+")
            }
        }
    }
}


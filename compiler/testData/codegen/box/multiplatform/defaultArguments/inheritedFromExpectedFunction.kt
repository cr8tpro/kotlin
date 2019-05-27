// !LANGUAGE: +MultiPlatformProjects
// WITH_RUNTIME
// MODULE: lib
// FILE: common.kt

expect fun foo(a: String, b: String = "O"): String

// FILE: platform.kt

import kotlin.test.assertEquals

actual fun foo(a: String, b: String) = a + b

// MODULE: main(lib)
// FILE: main.kt

fun box(): String {
    return foo("") + foo("K", "")
}
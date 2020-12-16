package hm.verysmart.test_task_20

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main(args: Array<String>) {
    println(App().greeting)
}

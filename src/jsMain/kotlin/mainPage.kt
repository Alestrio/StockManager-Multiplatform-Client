/* Main frontend Kotlin methods */
import kotlinx.browser.window

fun main() {
    window.onload = {
        // First method called when the page is opened
        // Loading base HTML page
        loadHtml()
        //Connects to DBs
        val appDb = AppSettings()
        val arraystDB = appDb.getStockableDatabases()

        // Checks if the user is logged in
        val isLoggedIn = checkIfLoggedIn()
        // Generate the "Welcome" message or the login form
        generateUserConnectionState(isLoggedIn)
        // Generating content of the page based on the user connection state
        generateBody(isLoggedIn)
    }
}

fun generateUserConnectionState(isLoggedIn: Boolean) {
    TODO("Generate user connection state")
}

fun generateBody(isLoggedIn : Boolean): dynamic {
    TODO("Generate body")
}

fun loadHtml(): dynamic {
    TODO("Load HTML")
}

fun checkIfLoggedIn(): Boolean {
    TODO("Check if logged in")
}

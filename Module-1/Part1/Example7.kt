fun displayAlertMessage(operatingSystem: String, emailId: String): String {
    return "There is a new sign-in request on $operatingSystem for your Google Account $emailId."
}

fun main() {
    println(displayAlertMessage("Windows", "student@example.com"))
}

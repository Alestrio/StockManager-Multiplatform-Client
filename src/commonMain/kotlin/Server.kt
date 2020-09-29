import stockable.Stockable

class Server(address : String, username : String, password: String, tableName:String) {
    private val stockables = ArrayList<Stockable>()
    fun connect() {
        TODO("Not yet implemented")
    }

    fun disconnect() {
        TODO("Not yet implemented")
    }

    fun executeQuery(query:String): String {
        TODO("Not yet implemented")
    }

    private fun fetchDatabaseItems(){
        TODO("Fetch database Items")
    }

    fun getDatabaseItems():ArrayList<Stockable>{
        return stockables
    }

    fun getSampleItem(){
        TODO("Get sample item for tests")
    }
}
class AppSettings(var address : String, var username : String, var password: String) {
    init{

    }

    fun getPropertyByKey(key:String):String{
        TODO("Get property by key")
    }

    fun getStockableModels(){
        TODO("Get stockable Models")
    }

    fun getStockableDatabases(): Server {
        TODO()
    }
}
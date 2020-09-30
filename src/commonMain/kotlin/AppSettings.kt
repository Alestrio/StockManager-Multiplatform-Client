class AppSettings(private val filePath:String="") {
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

    fun getAddress():String{
        return this.getPropertyByKey("address")
    }

    fun getUsername():String{
        return this.getPropertyByKey("username")
    }

    fun getPassword():String{
        return this.getPropertyByKey("password")
    }
}